package services;

import java.util.ArrayList;

import com.citadel.edu.model.interfaces.Transaction;

public class TransactionService {
	public static ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	public TransactionService() {
		
	}
	public ArrayList<Transaction> getTransaction() {
		return transactions;
	}
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
}