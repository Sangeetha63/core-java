package com.xworkz.Stringapp;

import java.util.Scanner;

public class CountOrder {
	public static void main(String args[]) {
		int n,count=0;
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			n=n/10;
			count++;
			System.out.println("number is "+count);
			
		}
		
	}

}
