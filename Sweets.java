package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.TreeSet;

public class Sweets {
	public static void main(String[] args) {
		String sweets1="gulab jamun";
		String sweets2="jalebi";
		String sweets3="kheer";
		String sweets4="rasmalai";
		String sweets5="badam halwa";
		String sweets6="peda";
		String sweets7="rasgulla";
		String sweets8="shrikhand";
		String sweets9="carrot halwa";
		String sweets10="phrini";
		String sweets11="guava cheese";
		String sweets12="kulfi";
		String sweets13="karanji";
		Collection<String>collection = new TreeSet();
		collection.add(sweets1);
		collection.add(sweets2);
		collection.add(sweets3);
		collection.add(sweets4);
		collection.add(sweets5);
		collection.add(sweets6);
		collection.add(sweets7);
		collection.add(sweets8);
		collection.add(sweets9);
		collection.add(sweets10);
		collection.add(sweets11);
		collection.add(sweets12);
		collection.add(sweets13);
		collection.add("ravaladdu");
		System.out.println(collection.size());
		collection.clear();
	    System.out.println("after clear..");
		System.out.println(collection.size());
		
		

	}

}
