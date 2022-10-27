package com.springjpa.demo.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entities {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	private String email;
	private String company_name;
	private boolean is_company;
	private Date created_at;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public boolean isIs_company() {
		return is_company;
	}
	public void setIs_company(boolean is_company) {
		this.is_company = is_company;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Entities() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entities(int id, String name, String address, String email, String company_name, boolean is_company,
			Date created_at) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.company_name = company_name;
		this.is_company = is_company;
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "Enities [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", company_name="
				+ company_name + ", is_company=" + is_company + ", created_at=" + created_at + "]";
	}
	
	

}
