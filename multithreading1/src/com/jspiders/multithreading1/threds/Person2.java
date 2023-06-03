package com.jspiders.multithreading1.threds;
import com.jspiders.multithreading1.resource.Account;
public class Person2 extends Thread{
Account account;
public Person2(Account account) {
	this.account=account;
}
@Override
	public void run() {
		account.depositBalance(3000);
		account.withdrawAmount(1500);
}
}
