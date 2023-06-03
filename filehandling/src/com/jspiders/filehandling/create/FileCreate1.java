package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class FileCreate1 {
public static void main(String[] args) {
	File file=new File("WEJM5sample.txt");
	try {
		file.createNewFile();
		System.out.println("File Created Succesfully....!!!");
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("File not Created.....!!!");
	}
}
}

