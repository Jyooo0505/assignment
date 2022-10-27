package com.springjpa.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.springjpa.demo.modal.Entities;
public interface EntitiesRepo extends CrudRepository<Entities, Integer>{

}
