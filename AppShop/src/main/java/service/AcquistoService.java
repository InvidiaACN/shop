package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Acquisto;
import repository.AcquistoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AcquistoService {
	
	@Autowired
	private AcquistoRepository acquistoRepository;

	//metodo per salvare un acquisto
	
	public Acquisto saveAcquisto(Acquisto acquisto) {
		return acquistoRepository.save(acquisto);
	}
	
	//metodo per recuperare tutti gli acquisti
	
	public List<Acquisto> getAllAcquisti(){
		return acquistoRepository.findAll();
	}
	
	//metodo per recuperare acquistoato per id 
	
	public Optional<Acquisto> getAcquistoById(Integer id){
		return acquistoRepository.findById(id);
	}
	
	//Metodo per aggiornare un acquisto
	
	public Acquisto updateAcquisto(Acquisto acquisto) {
		if (acquistoRepository.existsById(acquisto.getId())) {
			return acquistoRepository.save(acquisto);
		}else {
			return null;
		}
	}
	
	//Metodo per eliminare un acquisto
	
	public void deleteAcquisto(Integer id) {
		acquistoRepository.deleteById(id);
	}
}
