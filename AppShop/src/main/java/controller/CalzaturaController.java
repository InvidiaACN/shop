package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app1.api.ApiApi;

import service.CalzaturaService;
import entity.Calzatura;
import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/calzature")
public class CalzaturaController implements ApiApi {

    @Autowired
    private CalzaturaService calzaturaService;

    // Implemento GET per ottenere tutte le calzature
    @Override
    @GetMapping
    public ResponseEntity<List<Calzatura>> apiCalzatureGet() {
        List<Calzatura> calzature = calzaturaService.getAllCalzature();
        return new ResponseEntity<>(calzature, HttpStatus.OK);
    }

    // Implemento GET per ottenere una calzatura per ID
    @GetMapping("/{id}")
    public ResponseEntity<Calzatura> apiCalzaturaIdGet(@PathVariable Integer id) {
        Optional<Calzatura> calzatura = calzaturaService.getCalzaturaById(id);
        return calzatura.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Implemento POST per creare una nuova calzatura
    @PostMapping
    public ResponseEntity<Calzatura> apiCalzaturaPost(
            @Parameter(name = "Calzatura", description = "", required = true) @Valid @RequestBody Calzatura calzatura) {
        Calzatura savedCalzatura = calzaturaService.saveCalzatura(calzatura);
        return new ResponseEntity<>(savedCalzatura, HttpStatus.CREATED);
    }

    // Implemento PUT per aggiornare una calzatura esistente
    @PutMapping("/{id}")
    public ResponseEntity<Calzatura> apiCalzaturaIdPut(
            @PathVariable("id") Integer id, @RequestBody Calzatura calzatura) {
        calzatura.setId(id);
        Calzatura updatedCalzatura = calzaturaService.updateCalzatura(calzatura);
        return updatedCalzatura != null ?
                new ResponseEntity<>(updatedCalzatura, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Implemento DELETE per eliminare una calzatura per ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> apiCalzaturaIdDelete(@PathVariable("id") Integer id) {
        calzaturaService.deleteCalzatura(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
