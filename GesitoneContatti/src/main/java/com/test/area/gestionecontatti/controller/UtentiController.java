package com.test.area.gestionecontatti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.area.gestionecontatti.model.Utente;
import com.test.area.gestionecontatti.repository.UtentiRepository;

@RestController
@RequestMapping("/api/v1/utenti")
public class UtentiController {

	@Autowired
	private UtentiRepository repository;
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Utente u) {
		repository.save(u);
	}
	
	@GetMapping
	public List<Utente> listAll() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Utente get(@PathVariable("id") long id) {
		return repository.getReferenceById(id);
	}
}
