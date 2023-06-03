package com.jspiders.multithreading1.threds;
import com.jspiders.multithreading1.resource.Company;
public class Developer extends Thread {
Company company;
public Developer(Company company) {
	super();
	this.company = company;
}



	@Override
	public void run() {
	company.applicationready(5);
	}

}