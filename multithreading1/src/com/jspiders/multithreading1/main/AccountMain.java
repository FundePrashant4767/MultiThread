package com.jspiders.multithreading1.main;
import com.jspiders.multithreading1.resource.Account;
import com.jspiders.multithreading1.threds.Person1;
import com.jspiders.multithreading1.threds.Person2;
public class AccountMain {
	public static void main(String[] args) {
		Account account=new Account(10000);
		Person1 person1=new Person1(account);
		Person2 person2=new Person2(account);
		person1.start();
		person2.start();
		
	}
	
}

