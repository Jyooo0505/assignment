package com.springjpa.demo.repository;

import org.springframework.stereotype.Repository;
import com.springjpa.demo.modal.Cases;
@Repository
public interface CasesRepo extends CrudReposiory<Cases, Integer>
{
	
}
