package com.xworkz.showroomapp;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Manager {
	private String name;
	private Gender gender;
	private long contactNo;
	private int age;
	
	
	public void displayInfo() {
		System.out.println("enter mannager name");
		System.out.println("enter mannager id");
		System.out.println("enter mannager contactNo");
		System.out.println("enter mannager address");
	}


	

}
