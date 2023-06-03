package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class FileCreate3 {
public static void main(String[] args, File file) {
	File file = new  File(C:\Users\prash\OneDrive\Desktop\\wejm5.txt);
	if(file.exists()) {
		System.out.println("File Already Exists....!!");
	}else {
		try{
			file.createNewFile();
		
		System.out.println("File Created Succesfully....!!");
		}catch(IOException e) {
			System.out.println("File Not Created...!!");
		}
		
	}
		
	}
}

