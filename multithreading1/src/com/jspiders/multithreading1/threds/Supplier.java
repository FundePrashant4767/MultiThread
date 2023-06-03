package com.jspiders.multithreading1.threds;

import com.jspiders.multithreading1.resource.Shop;

public class Supplier extends Thread {
Shop shop;

public Supplier(Shop shop) {
	super();
	this.shop = shop;
}
  @Override
	public void run() {
		shop.restockproducts(20);
	}
}
