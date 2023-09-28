package com.test.area.gestionecontatti.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUtente;
	
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Long getIdUtente() {
		return idUtente;
	}
	public void setIdUtente(Long id) {
		this.idUtente = id;
	}
}
