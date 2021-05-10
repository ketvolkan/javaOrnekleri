package com.kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employers")
public class Employer extends User {

	@Id
	@GeneratedValue
	@Column(name= "id")
	private int id;
	
	@Column(name= "userId")
	private int userId;
	
	@Column(name= "companyName")
	private String companyName;
	
	@Column(name= "webSite")
	private String webSite;
	
	@Column(name= "phoneNumber")
	private String phoneNumber;

	public Employer() {
		
	}
	public Employer(int id, int userId, String companyName, String webSite, String phoneNumber) {
		super();
		this.id = id;
		this.userId = userId;
		this.companyName = companyName;
		this.webSite = webSite;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
