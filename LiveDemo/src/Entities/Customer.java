package Entities;
import java.sql.Date;

import Abstract.IEntity;

public class Customer implements IEntity {
	private int Id;
	private String firtsName;
	private String lastName;
	private Date dateOfBirth;
	private String NationalityId;
	
	public Customer(int id, String firtsName, String lastName, Date dateOfBirth, String nationalityId) {
		super();
		Id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
}
