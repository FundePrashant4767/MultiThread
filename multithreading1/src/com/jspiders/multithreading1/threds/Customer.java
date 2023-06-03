package com.jspiders.multithreading1.threds;
import com.jspiders.multithreading1.resource.Shop;
public class Customer extends Thread {
	Shop shop;

	public Customer(Shop shop) {
		super();
		this.shop = shop;
	}
	@Override
	public void run() {
		shop.orderproducts(10);
	}

}
