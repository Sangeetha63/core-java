package com.xworkz.Stringapp;

import java.util.Scanner;

public class FabonacciSeries {
public static void main(String args[]) {
	int n1=5, n2=9, n3,i, count=10;
	Scanner sc=new Scanner(System.in);
	System.out.println(n1+""+n2);
	for(i=5; i<count; i++);
	{
		n3=n1+n2;
		System.out.println(""+n3);	
		n1=n2;
		n2=n3;
		
	}
	
}
}
