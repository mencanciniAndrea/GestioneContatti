package com.test.area.gestionecontatti.repository;

import java.util.List;

import com.test.area.gestionecontatti.model.Contatto;

public interface ContattiRepositoryCustom {

	List<Contatto> getAllByParameters(String name,
									  String surname,
									  String phoneNumber,
									  String address,
									  String geodata,
									  String otherInfo);
}
