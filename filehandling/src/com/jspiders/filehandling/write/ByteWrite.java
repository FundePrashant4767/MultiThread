package com.jspiders.filehandling.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWrite {
public static void main(String[] args) {
	File file=new File("Byte.txt");
	if(file.exists()) {
	System.out.println("File is already exists....!!");
}else {
	try {
		file.createNewFile();
		System.out.println("File is created Succesfuly...!!");
	} catch (IOException e) {
		System.out.println("File not created...!!");
	}
}
	try {
		FileOutputStream fileOutputStream=new FileOutputStream(file);
			fileOutputStream.write(45);
			System.out.println("Data Writen to the File...!!");
			fileOutputStream.close();
	}
		catch (FileNotFoundException e) {
			System.out.println("File not Found...!!");
		}
		 catch (IOException e) {
		System.out.println("Unable to Write File....!!");
		
	}
}
}
