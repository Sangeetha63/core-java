package com.xworkz.Stringapp;

import java.util.Scanner;

public class SwappingWithoutVariable {
	public static void main(String args[]) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A");
		a=sc.nextInt();
		System.out.println("enter value of B");
		b=sc.nextInt();
		System.out.print("\n value of a and b before swapping is A :"+a+" B:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("\n value of a and b before swapping is A :"+a+" B:"+b);

		
	}

}
