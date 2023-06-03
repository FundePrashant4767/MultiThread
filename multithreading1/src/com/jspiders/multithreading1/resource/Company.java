package com.jspiders.multithreading1.resource;

public class Company {
 int applicationready;

public Company(int applicationready) {
	super();
	this.applicationready = applicationready;
}
public synchronized void orderedapplication(int noofproducts) {
	System.out.println("Trying to purches :" + noofproducts  + "Application");
	if(noofproducts>applicationready) {
		System.out.println(noofproducts  + "Application is not avalable....!!!");
		System.out.println("Please wait.....!!");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	applicationready -= noofproducts;
	System.out.println(noofproducts +  "Application Purchesed");
	System.out.println("Now avalable Application : " +   applicationready);
}
public synchronized void applicationready(int noofproducts) {
	System.out.println("Restocking : "  +  noofproducts  +"Application....!!!");
	applicationready += noofproducts;
	System.out.println("Now avalable applications :"  +   applicationready);
	this.notify();
}
}
