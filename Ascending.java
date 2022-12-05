package com.xworkz.Stringapp;

public class Ascending {
	public static void main(String args[]) {
		int arr[]=new int[] {34,56,78,89,108,566,4};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; i<arr.length; j++)	{
				int temp=0;
				if(arr[i]>arr[j]) {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
					 
			
				}
			}
			System.out.println(arr[i]);
		}
		
	}

}
