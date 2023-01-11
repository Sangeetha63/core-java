package com.xworkz.shopping.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;

public class SpringConfiguration {
	@Bean
	public String tree() {
	System.out.println("tree in config");
	String home = new String("mango");
	return home;
}

@Bean
public String fan() {
	System.out.println("fan in config");
	String tv = new String("Samsung ");
	return tv;
}

@Bean
public String name() {
	System.out.println("sangu in config");
	String psycho = new String(" sangu");
	return psycho;
}

@Bean
public String layman() {
	System.out.println("layman in config");
	String layman = new String("Layman Vinay");
	return layman;
}

@Bean
public String map1() {
	System.out.println("map in config");
	String map = new String("Indian Map");
	return map;
}

@Bean
public Boolean watch() {
	System.out.println("watch in config");
	Boolean clock = new Boolean(true);
	return clock;
}

@Bean
public Boolean night() {
	System.out.println("night in config");
	Boolean midnight = new Boolean(false);
	return midnight;
}

@Bean
public Boolean iceland() {
	System.out.println("iceland in config");
	Boolean island  = new Boolean(true);
	return island;
}

@Bean
public Boolean oxford() {
	System.out.println("oxford in config");
	Boolean oxford = new Boolean(false);
	return oxford;
}

@Bean
public Boolean student() {
	System.out.println("student in config");
	Boolean student = new Boolean(true);
	return student;
}

@Bean
public StringBuffer sprite() {
	System.out.println("sprite in config");
	StringBuffer inspiron = new StringBuffer("juice");
	return inspiron;
}

@Bean
public StringBuffer date() {
	System.out.println("date in config");
	StringBuffer date = new StringBuffer("Jan-10");
	return date;
}

@Bean
public StringBuffer volume() {
	System.out.println("volume in config");
	StringBuffer volume = new StringBuffer();
	return volume;
}

@Bean
public StringBuffer write() {
	System.out.println("write in cinfig");
	StringBuffer write = new StringBuffer();
	return write;
}

@Bean
public StringBuffer wrong() {
	System.out.println("wrong in config");
	StringBuffer wrong = new StringBuffer();
	return wrong;
}

@Bean
public StringBuilder king() {
	System.out.println("king in config");
	StringBuilder king = new StringBuilder();
	return king;
}

@Bean
public StringBuilder powerStar() {
	System.out.println("powerStar in config");
	StringBuilder powerStar = new StringBuilder();
	return powerStar;
}

@Bean
public StringBuilder search() {
	System.out.println("search in config");
	StringBuilder search = new StringBuilder();
	return search;
}

@Bean
public StringBuilder findName() {
	System.out.println("findName in config");
	StringBuilder find = new StringBuilder();
	return find;
}

@Bean
public StringBuilder logic() {
	System.out.println("logic in config");
	StringBuilder logic = new StringBuilder();
	return logic;
}

@Bean
public ArrayList list() {
	System.out.println("ceated arrayList");
	ArrayList array = new ArrayList();
	array.add("sangu");
	array.add("nandi");
	array.add("geetha");
	array.add("jaga");
	array.add("bharathi");
	return array;
}

@Bean
public Map map(){
	System.out.println("created map");
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("chocaolate", 50);
	map.put("Kitkat", 100);
	map.put("milkybar", 75);
	map.put("dairly milk", 600);
	map.put("sigger", 1000);
	return map;
	
}
}


