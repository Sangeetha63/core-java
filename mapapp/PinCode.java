package com.xworkz.mapapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PinCode {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("Hassan", 573201);
		map.put("Mysore", 573216);
		map.put("Bangalore", 573289);
		map.put("Mandya", 573201);
		map.put("Shivanagar", 573291);
		map.put("Hagare", 573224);
		map.put("belur", 573245);
		map.put("Chikkamangalore", 573256);
		map.put("Ramanagr", 573281);
		map.put("Jpnagr", 573278);
		System.out.println(map.size());
		
		Set<String> keys=map.keySet();
		keys.forEach(e->System.out.println(e));
		
		System.out.println("=============");
		Collection<Integer> values=map.values();
		values.forEach(v->System.out.println(v));
		
		Set<Entry<String,Integer>> entries=map.entrySet();
		
		for(Entry<String,Integer> entry:entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		

	}

}



