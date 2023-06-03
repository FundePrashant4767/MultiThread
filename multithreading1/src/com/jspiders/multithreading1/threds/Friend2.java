package com.jspiders.multithreading1.threds;
import com.jspiders.multithreading1.resource.BikeResource;
public class Friend2 extends Thread{
	BikeResource bikeresource;

	public Friend2(BikeResource bikeresource) {
	this.bikeresource = bikeresource;
	}
	@Override
	public void run() {
		synchronized (bikeresource.resource2) {
			System.out.println(this.getName() + "Locked" + bikeresource.resource2);
			synchronized (bikeresource.resource1) {
				System.out.println(this.getName() + "Locked" + bikeresource.resource1);
			}
			System.out.println(this.getName() + "Released" + bikeresource.resource1);
			
		}
		System.out.println(this.getName() + "Released" + bikeresource.resource2);
		}
	}

