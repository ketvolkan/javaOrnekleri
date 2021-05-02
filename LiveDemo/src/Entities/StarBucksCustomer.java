package Entities;

import java.sql.Date;

public class StarBucksCustomer extends Customer{

	private int starCount=0;
	public StarBucksCustomer(int id, String firtsName, String lastName, Date dateOfBirth, String nationalityId) {
		super(id, firtsName, lastName, dateOfBirth, nationalityId);
		// TODO Auto-generated constructor stub
	}
	public int getStarCount() {
		return starCount;
	}
	public void setStarCount(int starCount) {
		this.starCount = starCount;
	}

}
