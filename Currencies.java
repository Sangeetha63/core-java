package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.TreeSet;

public class Currencies {
	public static void main(String[] args) {
		String currencies1="indian rupees";
		String currencies2="euro";
		String currencies3="pound";
		String currencies4="albanian lek";
		String currencies5="swiss franc";
		String currencies6="mexican peso";
		String currencies7="japanese yen";
		String currencies8="canadian dollar";
		String currencies9="hong kong dollar";
		String currencies10="peso uruguayo";
		String currencies11="czech koruna";
		String currencies12="cambodian riel";
		String currencies13="cambodian riel";
		String currencies14="cambodian riel";
		String currencies15="hungarian forint";
		String currencies16="maruitanian ouguiya";
		String currencies17="south korean won";
		String currencies18="brunei dollar";
		String currencies19="saudi riyal";
		String currencies20="krone";
		String currencies21="bangladeshi taka";
		String currencies22="zambian kwacha";
		String currencies23="south african rand";
		String currencies24="danish krone";
		String currencies25="russian ruble";
		String currencies26="turkish lira";
		
		Collection<String>collection = new TreeSet();
		collection.add(currencies26);
		collection.add(currencies25);
		collection.add(currencies24);
		collection.add(currencies23);
		collection.add(currencies22);
		collection.add(currencies21);
		collection.add(currencies20);
		collection.add(currencies19);
		collection.add(currencies18);
		collection.add(currencies17);
		collection.add(currencies16);
		collection.add(currencies15);
		collection.add(currencies13);
		collection.add(currencies14);
		collection.add(currencies12);
		collection.add(currencies11);
		collection.add(currencies10);
		collection.add(currencies9);
		collection.add(currencies8);
		collection.add(currencies7);
		collection.add(currencies6);
		collection.add(currencies5);
		collection.add(currencies4);
		collection.add(currencies3);
		collection.add(currencies2);
		collection.add(currencies1);
		
		
		
		System.out.println(collection.size());
		collection.add("chinese yuan");
		collection.clear();
	    System.out.println("after clear..");
	    System.out.println(collection.size());
		

	}

}
	


