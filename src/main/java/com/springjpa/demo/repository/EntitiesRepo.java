package com.springjpa.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.springjpa.demo.modal.Entities;
public interface EntitiesRepo extends CrudRepository<Entities, Integer>{

	
	@Query("SELECT count(entity_id) FROM Entities_To_Case e, Cases s WHERE e.id=c.id")
	List<Entities> findEntities(String caseNumber);
}
