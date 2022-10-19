package com.esame.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esame.demo.model.Utente;
@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long>{

}
