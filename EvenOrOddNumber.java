package com.xworkz.Stringapp;

import java.util.Scanner;

public class EvenOrOddNumber {
	public static void main(String args[]) {
	int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		x=sc.nextInt();	
		if(x%2==0) {
			System.out.println("even");
		}
		else {
			
			System.out.println("odd");
		}
	}

}
