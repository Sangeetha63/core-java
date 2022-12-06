package com.xworkz.Stringapp;

import java.util.Arrays;

public class SecondLargestInArrays{
	 
		 public static int getSecondLargest(int[] a, int total){  
		  Arrays.sort(a);;
		  return a[total-2];
		  
		 } 
		 public static void main (String args[]) {
			 int a[]= {1,2,5,6,3,2};
			 int b[]= {44,66,99,77,22,55,33};
			 System.out.println(" second largest:"+getSecondLargest(a,6));
			 System.out.println("second largest:"+getSecondLargest(b,7));
		 }
	
	
}