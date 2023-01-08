package com.xworkz.mapapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Chocolate {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("Dairy Milk", 40);
		map.put("Kitkat", 30);
		map.put("much", 45);
		map.put("Kachamongo", 47);
		map.put("Park", 20);
		map.put("mango", 10);
		map.put("Asmulla", 49);
		map.put("chacolate", 35);
		map.put("milkybar", 25);
		map.put("kinari", 10);
		
		System.out.println(map.size());
		
		Set<String> keys=map.keySet();
		keys.forEach(e->System.out.println(e));
		System.out.println("=======values=====");
		Collection<Integer> values=map.values();
		values.forEach(v->System.out.println(v));
		System.out.println("============");
		
		Set<Entry<String,Integer>> entries=map.entrySet();
		for(Entry<String,Integer> entry:entries){
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
				
				
		
		
		
		
		
		
	}

}



