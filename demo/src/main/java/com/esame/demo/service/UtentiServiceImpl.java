package com.esame.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esame.demo.model.Utente;
import com.esame.demo.repository.UtenteRepository;



@Service
public class UtentiServiceImpl implements UtentiService {

	@Autowired
	private UtenteRepository utenteRepository;
	
	@Override
	public List<Utente> getAllUtenti() {
		// TODO Auto-generated method stub
		return utenteRepository.findAll();
	}

	@Override
	public void salvaUtente(Utente utente) {
		// TODO Auto-generated method stub
		this.utenteRepository.save(utente);
		
	}

	@Override
	public Utente getUtenteById(long id) {
		Optional<Utente> optional = utenteRepository.findById(id);
		Utente utente = null;
	
			
			utente = optional.get();


		return utente;
}

	@Override
	public void cancellaUtenteById(long id) {
		
		this.utenteRepository.deleteById(id);
		
	}

}