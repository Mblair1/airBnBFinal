package com.citadel.edu;

import com.citadel.edu.model.Account;
import com.citadel.edu.model.CardTransaction;
import com.citadel.edu.model.House;
import com.citadel.edu.model.Rental;
import com.citadel.edu.model.Review;
import com.citadel.edu.model.TransactionHandler;

public class Sandbox {

	public static void main(String[] args) {
		Account testAccount = new Account("mblair", "password");
		
		testAccount.signUp();
		testAccount.signIn();
		
		House testHouse = new House("address", 100);
		
		Rental rental = new Rental();
		System.out.println("The rental id is: " + rental.getID());
		rental.setStartDate("12/01/20");
		rental.setEndDate("10/02/20");
		rental.setRenter(testAccount);
		
		/* Singleton to ensure a transaction is handled
		 * a single time in a multi-threaded or distributed system.
		 */
		TransactionHandler transHandler = TransactionHandler.getInstance();
		CardTransaction card = new CardTransaction();
		card.addCharge(rental, 50);
		card.process(rental);
		
		Review review = new Review();
		review.write();
		review.read();
	}

}
