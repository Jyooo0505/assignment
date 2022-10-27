package com.springjpa.demo.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cases {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String case_number;
	private Date created_at;
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
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "Cases [id=" + id + ", case_number=" + case_number + ", created_at=" + created_at + "]";
	}
	public Cases() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cases(int id, String case_number, Date created_at) {
		super();
		this.id = id;
		this.case_number = case_number;
		this.created_at = created_at;
	}
	
}
