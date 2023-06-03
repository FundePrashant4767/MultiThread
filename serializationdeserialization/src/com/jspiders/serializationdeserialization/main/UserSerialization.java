package com.jspiders.serializationdeserialization.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.jspiders.serializationdeserialization.object.User;

public class UserSerialization {

	public static void main(String[] args) {
		try {
		File file=new File("user.txt");
		if(file.exists()) {
			System.out.println("File already exists...!!");
		}else {
			file.createNewFile();
			System.out.println("File Created Succesfully....!!");
		}
		User user = new User();
		user.setId(1);
		user.setName("Sonal");
		user.setUsername("Pappa_ki_pari");
		user.setPassword("uddgayi@420");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(user);
		System.out.println("Object Written to the File..!!");
		fileOutputStream.close();
		objectOutputStream.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	
}
