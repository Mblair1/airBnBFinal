package services;

import java.util.ArrayList;

import com.citadel.edu.model.Account;

public class AccountService {
	public static ArrayList<Account> accounts = new ArrayList<Account>();
	
	public AccountService() {
		
	}
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public void addAccount(Account account) {
		accounts.add(account);
	}
}
