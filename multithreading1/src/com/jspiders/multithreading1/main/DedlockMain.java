package com.jspiders.multithreading1.main;

import com.jspiders.multithreading1.resource.Resource;
import com.jspiders.multithreading1.threds.Thread1;
import com.jspiders.multithreading1.threds.Thread2;

public class DedlockMain {
public static void main(String[] args) {
	Resource resource=new Resource();
	Thread1 thread1=new Thread1(resource);
	thread1.setName("T1");
	Thread2 thread2=new Thread2(resource);
	thread2.setName("T2");
	thread1.start();
	thread2.start();
}
}
