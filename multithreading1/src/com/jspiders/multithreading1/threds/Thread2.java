package com.jspiders.multithreading1.threds;
import com.jspiders.multithreading1.resource.Resource;
public class Thread2 extends Thread{
	Resource resource;

	public Thread2(Resource resource) {
	this.resource = resource;
	}
	@Override
	public void run() {
		synchronized (resource.resource2) {
			System.out.println(this.getName()+"Locked"+resource.resource2);
			synchronized (resource.resource1) {
				System.out.println(this.getName()+"Locked"+resource.resource1);
			}
			System.out.println(this.getName()+"Released"+resource.resource1);
			
		}
		System.out.println(this.getName()+"Released"+resource.resource2);
		}
	}

