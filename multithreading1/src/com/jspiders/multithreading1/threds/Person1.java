package com.jspiders.multithreading1.threds;
import com.jspiders.multithreading1.resource.Account;
public class Person1 extends Thread {
	Account account;
	public Person1(Account account) {
		this.account=account;
	}
@Override
public void run() {
	account.depositBalance(5000);
	account.withdrawAmount(3000);
}
}
