package com.jspiders.multithreading1.resource;

public class Shop {
int avalableproducts;

public Shop(int avalableproducts) {
	super();
	this.avalableproducts = avalableproducts;
}
public synchronized void orderproducts(int noofproducts) {
	System.out.println("Trying to purches :" + noofproducts  + "Products");
	if(noofproducts>avalableproducts) {
		System.out.println(noofproducts+"products not avalable....!!!");
		System.out.println("Please wait.....!!");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	avalableproducts -= noofproducts;
	System.out.println(noofproducts+"Productpurchesed");
	System.out.println("Now avalable products : " + avalableproducts);
}
public synchronized void restockproducts(int noofproducts) {
	System.out.println("Restocking : " + noofproducts +"products....!!!");
	avalableproducts += noofproducts;
	System.out.println("Now avalable products :"+avalableproducts);
	this.notify();
}
}
