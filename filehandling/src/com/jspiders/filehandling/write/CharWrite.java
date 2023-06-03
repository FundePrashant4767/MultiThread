package com.jspiders.filehandling.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharWrite {
public static void main(String[] args) {
	File file=new File("char.txt");
	if(file.exists()) {
		System.out.println("File is already exists...!!");
	}else {
		try {
			file.createNewFile();
			System.out.println("file created succesfully...!!");
		} catch (IOException e) {
			System.out.println("File not created...!!");
		}
		
	}
	try {
		FileWriter fileWriter=new FileWriter(file);
		fileWriter.write("This is from Program...!!");
		System.out.println("Data return to a file....!!");
		fileWriter.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
