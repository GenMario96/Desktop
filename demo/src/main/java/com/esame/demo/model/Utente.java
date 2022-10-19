package com.esame.demo.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table( name =  "utenti")
public class Utente {


	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long id;

	@Column ( name = "nome")
	private String nome;
	@Column ( name = "cognome")
	private String cognome;
	@Column ( name = "email",unique = true)
	protected String email;
	@Column ( name = "cf")
	private String cf;
	@Column ( name = "data_di_nascita")
	private Date dataNascita;
	@Column( name = "sesso")
	private String sesso;
	
	

	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
