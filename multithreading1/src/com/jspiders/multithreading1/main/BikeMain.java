package com.jspiders.multithreading1.main;

import com.jspiders.multithreading1.resource.BikeResource;
import com.jspiders.multithreading1.threds.Friend1;
import com.jspiders.multithreading1.threds.Friend2;

public class BikeMain {
public static void main(String[] args) {
	BikeResource resource=new BikeResource();
	Friend1 friend1=new Friend1(resource);
	friend1.setName("Friend 1");
	Friend2 friend2=new Friend2(resource);
	friend2.setName("Friend 2");
	friend1.start();
	friend2.start();
}
}