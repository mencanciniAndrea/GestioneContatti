package com.test.area.gestionecontatti.repository;

import java.util.ArrayList;
import java.util.List;

import com.test.area.gestionecontatti.model.Contatto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class ContattiRepositoryCustomImpl implements ContattiRepositoryCustom{

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public List<Contatto> getAllByParameters(String name, String surname, String phoneNumber, String address,
			String geodata, String otherInfo) {
		
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Contatto> query = cb.createQuery(Contatto.class);
        Root<Contatto> contatto = query.from(Contatto.class);
        
        List<Predicate> predicates = new ArrayList<>();
        
        Path<String> namePath = contatto.get("name");
        Path<String> surnamePath = contatto.get("surname");
        Path<String> phoneNumberPath = contatto.get("phoneNumber");
        Path<String> addressPath = contatto.get("address");
        Path<String> geodataPath = contatto.get("geodata");
        Path<String> otherInfoPath = contatto.get("otherInfo");
        
        if(name != null && !name.isEmpty()) {
        	predicates.add(cb.like(namePath, "%" + name + "%"));
        }
        
        if(surname != null && !surname.isEmpty()) {
        	predicates.add(cb.like(surnamePath, "%" + surname + "%"));	
        }
        
        if(phoneNumber != null && !phoneNumber.isEmpty())
        {
        	predicates.add(cb.equal(phoneNumberPath, phoneNumber));	
        }
        
        if(address != null && !address.isEmpty()) {
        	predicates.add(cb.like(addressPath, "%" + address  + "%"));	
        }
        
        if(geodata != null && !geodata.isEmpty()) {
        	predicates.add(cb.equal(geodataPath, geodata));	
        }
        
        if(otherInfo != null && !otherInfo.isEmpty()) {
        	predicates.add(cb.like(otherInfoPath, "%" + otherInfo + "%"));	
        }
        
        if(!predicates.isEmpty()) {
        	query.select(contatto)
            .where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
        }
        else {
        	query.select(contatto);
        }
        
        
        return entityManager.createQuery(query).getResultList();
	}

}
