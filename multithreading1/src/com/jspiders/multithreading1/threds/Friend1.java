
	package com.jspiders.multithreading1.threds;

	import com.jspiders.multithreading1.resource.BikeResource;

	public class Friend1 extends Thread{
	BikeResource bikeresource;

	public Friend1(BikeResource resource) {
		super();
		this.bikeresource = resource;
	}

	

	@Override
	public void run() {
		synchronized (bikeresource.resource1) {
			System.out.println(this.getName() + "Locked" + bikeresource.resource1);
			synchronized (bikeresource.resource2) {
				System.out.println(this.getName() + "Locked" + bikeresource.resource2);
			}
			System.out.println(this.getName() + "Released" + bikeresource.resource2);
			
		}
		System.out.println(this.getName() + "Released" + bikeresource.resource1);
		}
	}

