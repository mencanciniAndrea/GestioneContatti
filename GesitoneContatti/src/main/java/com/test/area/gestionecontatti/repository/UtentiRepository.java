package com.test.area.gestionecontatti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.area.gestionecontatti.model.Utente;

public interface UtentiRepository extends JpaRepository<Utente, Long> {

}
