package com.xworkz.Stringapp;

import java.util.Scanner;

public class SwappingVariable {
	public static void main(String args[]) {
		int a;
		int b;
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A and B");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print("\n value of a and b before swapping is A :"+a+" B:"+b);
		y=a;
		a=b;
		b=y;
		
		
		System.out.print("\n value of a and b before swapping is A :"+a+" B:"+b);

	}
	

}
