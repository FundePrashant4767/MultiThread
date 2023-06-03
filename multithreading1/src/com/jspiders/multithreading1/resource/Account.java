package com.jspiders.multithreading1.resource;

public class Account {
int accountBalance;
public Account(int accountBalance) {
	super();
	this.accountBalance = accountBalance;
}
public void checkBalance() {
	System.out.println("Current Balance:"+accountBalance);
}
public synchronized void depositBalance(int amount) {
	System.out.println("Depositing"+amount + "rs in amount");
	accountBalance += amount;
	checkBalance();
}
public synchronized void withdrawAmount(int amount) {
	System.out.println("Trying to withraw"+amount+"rs from account");
	if(amount>accountBalance) {
		System.out.println("Insufficient Balance");
	}
	else {
		accountBalance -= amount;
		checkBalance();
	}
}
}
