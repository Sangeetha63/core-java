package com.xworkz.Stringapp;

public class CountEvenOdd {
	public static void main(String args[]) {
		int arr[]= {2,1,43,56,11,34};
		int even=0;
		int odd=0;
		for(int i=0; i<10; i++) {
			if (arr[i]%2==0) {
				even++;
			}
			else 
			{
				odd--;
		
			}
			System.out.println("contents of array");
			for(int index=0; index<10; index++) {
				System.out.println(arr[i]+"");	
			}
			System.out.println("even");
			System.out.println("odd");
	}

}
}
