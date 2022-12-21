package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.TreeSet;

public class Coupoun {
	public static void main(String args[]) {
		String coupoun1="SCHOOLPACK";
		String coupoun2="JOLLY15";
		String coupoun3="FESTIVE10";
		String coupoun4="DRINKMAS";
		String coupoun5="PUMPKIN";
		String coupoun6="HOWDY10";
		String coupoun7="SHIPITFREE";
		String coupoun8="FREESHIP";
		String coupoun9="TAKEITALL";
		String coupoun10="WINTERISOVER";
		String coupoun11="BFCONTEST";
		String coupoun12="GIFTGUIDE";
		Collection <String> collection=new TreeSet();
		collection.add(coupoun12);
		collection.add(coupoun11);
		collection.add(coupoun10);
		collection.add(coupoun9);
		collection.add(coupoun8);
		collection.add(coupoun7);
		collection.add(coupoun6);
		collection.add(coupoun5);
		collection.add(coupoun4);
		collection.add(coupoun3);
		collection.add(coupoun2);
		collection.add(coupoun1);
		collection.add("GDAY10");
		System.out.println(collection.size());
		collection.clear();
		System.out.println("after clear");
		System.out.println(collection.size());
		
	}

}
