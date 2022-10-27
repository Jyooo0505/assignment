package com.springjpa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.demo.modal.Cases;
import com.springjpa.demo.modal.Entities;
import com.springjpa.demo.modal.Entities_To_Cases;
import com.springjpa.demo.repository.CasesRepo;
import com.springjpa.demo.repository.EntitiesRepo;
import com.springjpa.demo.repository.Entities_to_CasesRepo;

@RestController
public class CaseController {

	@Autowired
	CasesRepo casesRepo;
	
	@Autowired
	EntitiesRepo entitiesRepo;
	
	@Autowired
	Entities_to_CasesRepo entities_To_CasesRepo;

	@GetMapping(value="/casesCount")
	public int getCasesCount()
	{
		return (int) casesRepo.count();
	}
	
	@GetMapping(value="/cases")
	public List<Cases> getCases()
	{
		return (List<Cases>) this.casesRepo.findAll();
	}
	
	@PostMapping(value="/entities")
	public Entities createEntities(@RequestBody Entities entity)
	{
		return this.entitiesRepo.save(entity);
	}
	
	@GetMapping(value="/entities_to")
	public List<Entities_To_Cases> getEntitiesTo() {
          return (List<Entities_To_Cases>) this.entities_To_CasesRepo.findAll();
	}
	
	@GetMapping(value="/cases/{caswNumber}/entities")
	public List<Entities> RetrieveEntitiesToCase(@PathVariable String caseNumber)
	{
		return this.entitiesRepo.findEntities(caseNumber);
	}
	
	
	
}
