package com.jspiders.multithreading1.threds;

import com.jspiders.multithreading1.resource.Resource;

public class Thread1 extends Thread{
Resource resource;

public Thread1(Resource resource) {
	super();
	this.resource = resource;
}

@Override
public void run() {
	synchronized (resource.resource1) {
		System.out.println(this.getName()+"Locked"+resource.resource1);
		synchronized (resource.resource2) {
			System.out.println(this.getName()+"Locked"+resource.resource2);
		}
		System.out.println(this.getName()+"Released"+resource.resource2);
		
	}
	System.out.println(this.getName()+"Released"+resource.resource1);
	}
}