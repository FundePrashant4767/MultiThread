package com.jspiders.multithreading1.resource.company;

import com.jspiders.multithreading1.resource.Company;
import com.jspiders.multithreading1.threds.Client;
import com.jspiders.multithreading1.threds.Developer;

public class CompanyDepartment{
	public static void main(String[] args) {
		Company company=new Company(2);
		Client client=new Client(company);
		Developer developer=new Developer(company);
		client.start();
	developer.start();
	}
}