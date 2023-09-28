package com.test.area.gestionecontatti.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Contatto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idContatto;
	
	private Long utente;
	
	private String surname;
	private String name;
	private String phoneNumber;
	private String address;
	private String geodata;
	private String otherInfo;
	
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public long getIdContatto() {
		return idContatto;
	}
	public void setIdContatto(long idContatto) {
		this.idContatto = idContatto;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGeodata() {
		return geodata;
	}
	public void setGeodata(String geodata) {
		this.geodata = geodata;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	public Long getUtente() {
		return utente;
	}
	public void setUtente(Long utente) {
		this.utente = utente;
	}
	
	
	
}
