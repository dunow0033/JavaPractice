package bankhomework;

import java.util.List;
import java.util.ArrayList;

public class Bank {
	private List<Account> accounts;
	
	public Bank() {
		accounts = new ArrayList<Account>();
	}
	
	public void addAccount(Account account) {
		accounts.add(account);	
	}
}
