package com.test.area.gestionecontatti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.area.gestionecontatti.model.Contatto;

public interface ContattiRepository extends JpaRepository<Contatto, Long> , ContattiRepositoryCustom {

	
}
