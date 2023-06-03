package com.jspiders.multithreading1.threds;
import com.jspiders.multithreading1.resource.Company;
public class Client extends Thread {
Company company;
public Client(Company company) {
	super();
	this.company = company;
}



	@Override
	public void run() {
		company.orderedapplication(5);
	}

}