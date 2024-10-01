package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.app1.api.ApiApi;
import entity.Acquisto;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import service.AcquistoService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/acquisti")
public class AcquistoController implements ApiApi {

    @Autowired
    private AcquistoService acquistoService;

    // Implemento GET
    @Override
    public ResponseEntity<List<Acquisto>> apiAcquistiGet() {
        List<Acquisto> acquisti = acquistoService.getAllAcquisti();
        return new ResponseEntity<>(acquisti, HttpStatus.OK);
    }


    // Get by Id
    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Acquisto> apiAcquistiIdGet(@PathVariable Integer id) {
        Optional<Acquisto> acquisto = acquistoService.getAcquistoById(id);
        return acquisto.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Post
    @PostMapping
    public ResponseEntity<Acquisto> apiAcquistiPost(
            @Parameter(name = "Acquisto", description = "", required = true) 
            @Valid @RequestBody Acquisto acquisto) {
        Acquisto savedAcquisto = acquistoService.saveAcquisto(acquisto);
        return new ResponseEntity<>(savedAcquisto, HttpStatus.CREATED);
    }

    // Put by Id
    @PutMapping("/{id}")
    public ResponseEntity<Acquisto> apiAcquistiIdPut(
            @Parameter(name = "id", description = "ID dell'acquisto da aggiornare", required = true, in = ParameterIn.PATH) 
            @PathVariable("id") Integer id,
            @Parameter(name = "Acquisto", description = "", required = true) 
            @Valid @RequestBody Acquisto acquisto) {
        acquisto.setId(id);
        Acquisto updatedAcquisto = acquistoService.updateAcquisto(acquisto);
        return updatedAcquisto != null ?
                new ResponseEntity<>(updatedAcquisto, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Delete by Id
    @Override
    @DeleteMapping("/{idAcquisto}")
    public ResponseEntity<Acquisto> apiAcquistiIdDelete(
            @PathVariable("idAcquisto") Integer id) {
        acquistoService.deleteAcquisto(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
