package Entities;

import Abstract.IEntities;

public class Users implements IEntities {
	private int Id;
	private String email;
	
	public Users(int id, String email) {
		super();
		Id = id;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
}
