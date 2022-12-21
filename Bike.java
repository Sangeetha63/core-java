package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.TreeSet;

public class Bike {
	public static void main(String args[]) {
	String bike1="KTM";
	String bike2="Ducati";
	String bike3="Aprilla";
	String bike4="bajai";
	String bike5="bajaj pulsar";
	String bike6="tvs";
	String bike7="abe-star";
	String bike8="bimota";
	String bike9="hero honda";
	String bike10="yamaha";
	String bike11="royal enfield";
	String bike12="suzuki";
	String bike13="honda";
	String bike14="bullet";
	String bike15="rs";
	String bike16="vespa";
	String bike17="honda";
	String bike18="bmw";
	
	Collection<String>collection = new TreeSet();
	collection.add(bike1);
	collection.add(bike2);
	collection.add(bike3);
	collection.add(bike4);
	collection.add(bike5);
	collection.add(bike6);
	collection.add(bike7);
	collection.add(bike8);
	collection.add(bike9);
	collection.add(bike10);
	collection.add(bike12);
	collection.add(bike13);
	collection.add(bike15);
	collection.add(bike16);
	collection.add(bike17);
	collection.add(bike18);

	
	
	collection.add("benellisss");
	System.out.println(collection.size());
    collection.clear();
    System.out.println("after clear..");
    System.out.println(collection.size());
}

}
	


