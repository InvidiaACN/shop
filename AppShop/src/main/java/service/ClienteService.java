package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.ClienteRepository;
import entity.Cliente;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Ottiene tutti i clienti
    public List<Cliente> getAllClienti() {
        return clienteRepository.findAll();
    }

    // Ottiene un cliente per ID
    public Optional<Cliente> getClienteById(Integer id_cliente) {
        return clienteRepository.findById(id_cliente);
    }

    // Salva un nuovo cliente
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Aggiorna un cliente esistente
    public Cliente updateCliente(Cliente cliente) {
        if (clienteRepository.existsById(cliente.getId_cliente())) {
            return clienteRepository.save(cliente);
        }
        return null;
    }

    // Elimina un cliente per ID
    public void deleteCliente(Integer id_cliente) {
        clienteRepository.deleteById(id_cliente);
    }
}
