package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompany {
	public static void main(String args[]) {
		String name1="Infosys";
		String name2="Wipro";
		String name3="TCS";
		String name4="Accenture";
		String name5="IBM";
		String name6="Oracle";
		String name7="HCL";
		String name8="MU SIGMA";
		String name9="AMAZON";
		String name10="Dell";
		String name11="Capgemeni";
		String name12="HP";
		String name13="Cognizant";
		String name14="Deloitte";
		String name15="Intel";
		String name16="google";
		String name17="SAP";
		String name18="EY";
		String name19="Nokia";
		String name20="kpmg";
		Collection<String>collection=new ArrayList<String>();
		collection.add(name20);
		collection.add(name19);
		collection.add(name18);
		collection.add(name17);
		collection.add(name16);
		collection.add(name15);
		collection.add(name14);
		collection.add(name13);
		collection.add(name12);
		collection.add(name11);
		collection.add(name10);
		collection.add(name9);
		collection.add(name8);
		collection.add(name7);
		collection.add(name6);
		collection.add(name5);
		collection.add(name4);
		collection.add(name3);
		collection.add(name2);
		collection.add(name1);
		collection.add(null);
		collection.add("Lenvo");
		System.out.println(collection.size());
		System.out.println(collection);
		System.out.println("accessing all the element from collection");
		//for each
		
		for(String element:collection) {
			System.out.println(element);
		}
		System.out.println("......Iterator.....");
		Iterator<String>iterator=collection.iterator();
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println(element);
		}
		
		
		
	}

}
