package com.citadel.edu.model;

import com.citadel.edu.model.interfaces.Transaction;

public class CardTransaction implements Transaction {

	private String type = "card";

	public CardTransaction() {
		
	}
	public void process(Rental rental) {
		System.out.println("Rental number " + rental.getID() + " has been processed.");
	}

	public void cancel(Rental rental) {
		System.out.println("Rental number " + rental.getID() + " has been canceled.");
	}

	public void addCharge(Rental rental, int charge) {
		System.out.println("A charge of " + charge + " has been aded to your account for rental number " + rental.getID());
	}

}
