package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {
	public static void main(String args[]) {
		String name1="Dog";
		String name2="Donkey";
		String name3="Cow";
		String name4="Tiger";
		String name5="Lion";
		String name6="Rabbit";
		String name7="Fish";
		String name8="Elephant";
		String name9="Horse";
		String name10="Crocodile";
		Collection<String>collection=new ArrayList<String>();
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
		collection.add("Pigeon");
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



