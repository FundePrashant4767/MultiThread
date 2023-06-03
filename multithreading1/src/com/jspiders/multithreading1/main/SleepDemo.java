package com.jspiders.multithreading1.main;

public class SleepDemo {
public static void main(String[] args) {
	String message=" This is the exigution of sleep() method";
	
	for(int i=0;i<=message.length();i++) {
		System.out.print(message.charAt(i));
		try {
			Thread.currentThread().sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
