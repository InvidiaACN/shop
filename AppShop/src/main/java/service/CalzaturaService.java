package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.CalzaturaRepository;
import entity.Calzatura;

import java.util.List;
import java.util.Optional;

@Service
public class CalzaturaService {

    @Autowired
    private CalzaturaRepository calzaturaRepository;

    // Ottiene tutte le calzature
    public List<Calzatura> getAllCalzature() {
        return calzaturaRepository.findAll();
    }

    // Ottiene una calzatura per ID
    public Optional<Calzatura> getCalzaturaById(Integer id) {
        return calzaturaRepository.findById(id);
    }

    // Salva una nuova calzatura
    public Calzatura saveCalzatura(Calzatura calzatura) {
        return calzaturaRepository.save(calzatura);
    }

    // Aggiorna una calzatura esistente
    public Calzatura updateCalzatura(Calzatura calzatura) {
        if (calzaturaRepository.existsById(calzatura.getId())) {
            return calzaturaRepository.save(calzatura);
        }
        return null; // O puoi lanciare un'eccezione
    }

    // Elimina una calzatura per ID
    public void deleteCalzatura(Integer id) {
        calzaturaRepository.deleteById(id);
    }
}
