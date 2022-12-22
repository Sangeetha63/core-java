package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {
	public static void main(String args[]) {
		String bandName1="Tissot";
		String bandName2="Swatch";
		String bandName3="Patek";
		String bandName4="arguably";
		String bandName5="Rolex";
		Collection<String>collection=new ArrayList<String>();
		collection.add(bandName5);
		collection.add(bandName4);
		collection.add(bandName3);
		collection.add(bandName2);
		collection.add(bandName1);
		collection.add(null);
		collection.add("Timex");
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


