package com.test.area.gestionecontatti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.area.gestionecontatti.model.Contatto;
import com.test.area.gestionecontatti.repository.ContattiRepository;

@RestController
@RequestMapping("/api/v1/contatti")
public class ContattiController {
	
	@Autowired
	private ContattiRepository repository;

	@GetMapping
	public List<Contatto> list(){
		return repository.findAll();
	}
	
	@GetMapping("/cerca")
	public List<Contatto> getContatti(@RequestParam(required=false) String name,
									  @RequestParam(required=false) String surname,
									  @RequestParam(required=false) String phoneNumber,
									  @RequestParam(required=false) String address,
									  @RequestParam(required=false) String geodata,
									  @RequestParam(required=false) String otherInfo){
		
//		Contatto example = new Contatto();
//		example.setName(name);
//		example.setSurname(surname);
//		example.setPhoneNumber(phoneNumber);
//		example.setAddress(address);
//		example.setGeodata(geodata);
//		example.setOtherInfo(otherInfo);
//		
//		
//		
//		ExampleMatcher matcher = ExampleMatcher.matching()
//			    .withIgnoreCase()
//			    .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
//			    .withMatcher("surname", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
//			    .withMatcher("phoneNumber", ExampleMatcher.GenericPropertyMatchers.exact())
//			    .withMatcher("address", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
//				.withMatcher("geodata", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
//				.withMatcher("otherInfo", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());
//		
//		Example<Contatto> exampleToSearch = Example.of(example, matcher);

		// Esegui la ricerca
//		return repository.findAll(exampleToSearch);
		
		return repository.getAllByParameters(name, surname, phoneNumber, address, geodata, otherInfo);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Contatto c) {
		repository.save(c);
	}
	
	@GetMapping("/{id}")
	public Contatto get(@PathVariable("id") long id) {
		return repository.getReferenceById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") long id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody Contatto c) {
		repository.save(c);
	}
	
	
	
}
