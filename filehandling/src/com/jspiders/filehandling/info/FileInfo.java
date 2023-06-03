package com.jspiders.filehandling.info;

import java.io.File;
import java.io.IOException;

public class FileInfo {
public static void main(String[] args) {
	File file=new File("WEJM5.txt");
	if(file.exists()) {
		System.out.println();
	}else {
		try {
			file.createNewFile();
			System.out.println("File created succesfully...!!");
		} catch (IOException e) {
			System.out.println("File not created...!!");
		}
	}
	System.out.println("Name of the file :" +file.getName());
	System.out.println("Path of the File :"+file.getAbsolutePath());
	System.out.println("Length of the file :"+file.length());
	if(file.canRead()) {
		System.out.println("File is Readable...!!");
	}else {
		System.out.println("File is not Readable...!!");
	}
	if(file.canWrite()) {
		System.out.println("File is Writable...!!!");
	}else {
		System.out.println("File is not Writable...!!");
	}
	if(file.canExecute()) {
		System.out.println("File is Exicutable...!!");
	}else {
		System.out.println("File is not Exicutable...!!");
	}
}

}
