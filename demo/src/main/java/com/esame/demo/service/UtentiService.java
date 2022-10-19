package com.esame.demo.service;

import java.util.List;

import com.esame.demo.model.Utente;

public interface UtentiService {
	List<Utente> getAllUtenti();
	void salvaUtente(Utente utente);
	Utente getUtenteById(long id);
	void cancellaUtenteById(long id);
	
}

