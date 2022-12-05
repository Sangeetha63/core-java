package com.xworkz.Stringapp;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String args[]) {
		int num;
		int temp;
		int sum;
		int i=1;
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		sum=0;
		i=num;
		while(num>0) {
			n=num%10;
			num=num/10;
			sum=sum=(n*n*n);
		}
		if(sum==i) {
			System.out.println(i+"armstrong number");
		}
			else {
				System.out.println(i+"not armstrong number");
			}
		}
		
	}		
	
	


