package com.citadel.edu.model;

public class Renter extends Account {
	
	private int ID;
	private String cardInfo;
	private String address;
	
	public Renter(String username, String password) {
		super(username, password);
	}

	private void bookmark(House house) {
		System.out.println(house.toString() + " has been bookmarked.");
	}

}
