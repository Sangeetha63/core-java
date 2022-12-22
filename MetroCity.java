package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCity {
	public static void main(String args[]) {
		String name1="Bangalore";
		String name2="Delhi";
		String name3="Chennai";
		String name4="Hyderabad";
		String name5="Kolkata";
		Collection<String>collection=new ArrayList<String>();
		collection.add(name5);
		collection.add(name4);
		collection.add(name3);
		collection.add(name2);
		collection.add(name1);
		collection.add(null);
		collection.add("Surat");
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
