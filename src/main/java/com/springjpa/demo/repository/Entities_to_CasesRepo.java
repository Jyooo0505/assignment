package com.springjpa.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springjpa.demo.modal.Entities_To_Cases;

@Repository
public interface Entities_to_CasesRepo extends CrudRepository<Entities_To_Cases, Integer>
{
	
}