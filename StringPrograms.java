package com.xworkz.Stringapp;

public class StringPrograms {


	public static void main(String[] args) {
		String name="JAVA PROGRAMMING";
	
		
		System.out.println(name);
		//in built
	
     for( int i=0; i<=name.length(); i++) {
    		System.out.println(""+name.charAt(i));
     }

     
     System.out.println("String reverse");
		for(int i=name.length()-1;i>=0;i--) {
		System.out.print(""+name.charAt(i));
		
		

//counting a given char
int count=0;
int count1=0;



for( int i1=0; i1<name.length(); i1++) {
	if(name.charAt(i1)=='a') {
	count+=1;
	}
	else {
		count1+=1;
	}
	
}
	
	System.out.println("count:"+count);
	System.out.println("count1:"+count1);
	
	//without using inbuilt  and using array
	String str="GOOD MORNING";
	int count2=0;
	for(char ch:str.toCharArray()) {
		if(ch=='O') {
			count2+=1;
			
		}
		System.out.print(ch+"");
	}
	System.out.print("count2:"+count2);
	
	
	
	
	String names="madam";
	String reverse="";
	for(int i1=names.length()-1;i1>=0;i1--)
	{
		reverse+=names.charAt(i1);
	}
	
	if(names.equals(reverse)) {
		System.out.print("matched");
	}else {
		System.out.print("not matched");

	}
	}

	
}
}







	
	

