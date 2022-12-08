package com.xworkz.showroomapp;

import java.util.Scanner;

public class CeraShowroomTester {
public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scanner.nextInt();
		
		CeraShowroom bj = new CeraShowroom(size);
		
		for(int i = 0; i < size; i++) {
		
		Manager mg = new Manager();
		
		System.out.println("Enter manager name");
		mg.setName(scanner.next());
		
		System.out.println("Enter manager age");
		mg.setAge(scanner.nextInt());
		
		System.out.println("Enter manager contact number");
		mg.setContactNo(scanner.nextLong());
		
		System.out.println("Enter manager gender");
		String gender = scanner.next();
		mg.setGender(Gender.valueOf(gender));
		
		bj.addManager(mg);
		
		}
		
		System.out.println("Enter manager name");
		String name = scanner.next();
		bj.getManagerByName(name);
		
		System.out.println("Enter manager age");
		int age = scanner.nextInt();
		System.out.println("Enter new name");
		String name1 = scanner.next();
		bj.updateManagerNameByAge(age, name1);
		
		bj.getAllManagerDetails();
		
		System.out.println("Enter manager age we want to delete");
		int age2 = scanner.nextInt();
		bj.deleteManagerByAge(age2);
		
		bj.getNewManager();
}

}


