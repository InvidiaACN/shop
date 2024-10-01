package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app1.api.ApiApi;

import service.ClienteService;
import entity.Cliente;
import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/clienti")
public class ClienteController implements ApiApi {

    @Autowired
    private ClienteService clienteService;

    // Implemento GET per ottenere tutti i clienti
    @GetMapping
    public ResponseEntity<List<Cliente>> apiClienteGet() {
        List<Cliente> clienti = clienteService.getAllClienti();
        return new ResponseEntity<>(clienti, HttpStatus.OK);
    }

    // Implemento GET per ottenere un cliente per ID
    @GetMapping("/{id_cliente}")
    public ResponseEntity<Cliente> apiClienteIdClienteGet(@PathVariable Integer id_cliente) {
        Optional<Cliente> cliente = clienteService.getClienteById(id_cliente);
        return cliente.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Implemento POST per creare un nuovo cliente
    @PostMapping
    public ResponseEntity<Cliente> apiClientePost(
            @Parameter(name = "Cliente", description = "", required = true) @Valid @RequestBody Cliente cliente) {
        Cliente savedCliente = clienteService.saveCliente(cliente);
        return new ResponseEntity<>(savedCliente, HttpStatus.CREATED);
    }

    // Implemento PUT per aggiornare un cliente esistente
    @PutMapping("/{id_cliente}")
    public ResponseEntity<Cliente> apiClienteIdClientePut(
            @PathVariable("id_cliente") Integer id_cliente, @RequestBody Cliente cliente) {
        cliente.setId_cliente(id_cliente);
        Cliente updatedCliente = clienteService.updateCliente(cliente);
        return updatedCliente != null ?
                new ResponseEntity<>(updatedCliente, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Implemento DELETE per eliminare un cliente per ID
    @DeleteMapping("/{id_cliente}")
    public ResponseEntity<Void> apiClienteIdClienteDelete(@PathVariable("id_cliente") Integer id_cliente) {
        clienteService.deleteCliente(id_cliente);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
