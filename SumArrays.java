package com.xworkz.Stringapp;

import java.util.Scanner;

public class SumArrays {
	public static void main(String args) {
		int arr[]=new int[10];
		int i;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements(10) of the arary");
		for(i=0; i<10; i++) {
			arr[i]=sc.nextInt();
			sum =sum+arr[i];
		}
		System.out.println("\n sum of  the elements of the arary"+sum);
		}
	}
	


