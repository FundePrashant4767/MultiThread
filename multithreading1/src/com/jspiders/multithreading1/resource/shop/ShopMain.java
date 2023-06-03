package com.jspiders.multithreading1.resource.shop;

import com.jspiders.multithreading1.resource.Shop;
import com.jspiders.multithreading1.threds.Customer;
import com.jspiders.multithreading1.threds.Supplier;

public class ShopMain{
	public static void main(String[] args) {
		Shop shop=new Shop(5);
		Customer customer=new Customer(shop);
		Supplier supplier=new Supplier(shop);
		customer.start();
		supplier.start();
	}
}