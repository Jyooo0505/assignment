package com.springjpa.demo.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entities_To_Cases {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String case_number;
	private int entity_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCase_number() {
		return case_number;
	}
	public void setCase_number(String case_number) {
		this.case_number = case_number;
	}
	public int getEntity_id() {
		return entity_id;
	}
	public void setEntity_id(int entity_id) {
		this.entity_id = entity_id;
	}
	@Override
	public String toString() {
		return "Entities_To_Cases [id=" + id + ", case_number=" + case_number + ", entity_id=" + entity_id + "]";
	}
	
	
	public Entities_To_Cases() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entities_To_Cases(int id, String case_number, int entity_id) {
		super();
		this.id = id;
		this.case_number = case_number;
		this.entity_id = entity_id;
	}
	

}
