package com.xworkz.Stringapp;

import java.util.Scanner;

public class DuplicateArray {
public static  void main(String args []) {
	int arr[]=new int[50];
	int n;
	int i,j,k;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter arary size");
	n=sc.nextInt();
	System.out.println("enter "+n+" arary element");
	for(i=0; i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("content of tha array");
	for(i=0; i<n; i++) {
		System.out.println(arr[i]+"");	
	}
	
}
}
