package com.xworkz.mapapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class City {
	public static void main(String[] args) {
		Map<String,Double> map= new HashMap<String,Double>();
		map.put("Shivamoga", 27.4);
		map.put("Hassan", 25.4);
		map.put("Mysore", 26.98);
		map.put("Bengalore", 26.89);
		map.put("J&k", 13.5);
		map.put("Mandya", 26.5);
		map.put("Chamarajnagr", 34.4);
		
	System.out.println(map.size());
	
	if(map.isEmpty()) {
		System.out.println("map nali yenu illa");
	}
		else {
			System.out.println("Map nali yen yeno ide");
		}
	Set<String> key=map.keySet();
	key.forEach(e->System.out.println(e));
	
	System.out.println("=========VALUES==========");
	Collection<Double> values=map.values();
	values.forEach(e->System.out.println(e));
	
	System.out.println("Looping pair");
	System.out.println(map);
	
	
	
	Set<Entry<String,Double>> entries=map.entrySet();
	
for(Entry<String,Double> entry:entries) {
	System.out.println(entry.getKey()+" "+entry.getValue());
	
}
	

	
	
	
	
	}
}
	


