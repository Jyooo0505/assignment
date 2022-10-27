package com.springjpa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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
	
	
}
