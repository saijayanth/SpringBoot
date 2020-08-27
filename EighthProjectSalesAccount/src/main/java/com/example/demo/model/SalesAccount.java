package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SalesAccount {

	@Id
	@GeneratedValue
	private int sid;
	private String email;
	private String name;
	private String organisation;
	private int totalTranscation;
	
	
	@Override
	public String toString() {
		return "SalesAccount [sid=" + sid + ", email=" + email + ", name=" + name + ", organisation=" + organisation
				+ ", totalTranscation=" + totalTranscation + "]";
	}

	public int getTotalTranscation() {
		return totalTranscation;
	}
	public void setTotalTranscation(int totalTranscation) {
		this.totalTranscation = totalTranscation;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	
	
	
}
