package com.xworkz.monsoon.bean;

public class Actor {
	String name;
	String language;
	int age;
	public Actor() {
		System.out.println("Creating  actor");
	}
	
	@Override
	public String toString() {
		return "Actor [name=" + name + ", language=" + language + ", age=" + age + "]";
	}

	
	public String getName() {
		return name;
	}

	public String getLanguage() {
		return language;
	}

	
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void setLanguage(String language) {
		this.language = language;
	}

	
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
