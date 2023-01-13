package com.xworkz.springProperties.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	String name;
	String type;
	String number;
	@Autowired
	@Qualifier("8.0.11")
	double version;
	String company;
	int strokes;
	
	public Engine() {
		System.out.println("creating engine");
	}
	
	public Engine(@Qualifier("diesel engine")String name,@Qualifier("KA23")String number,double version, 
			int strokes, @Qualifier("internal engine")String type, @Qualifier("Honda")String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
		this.number = number;
		this.strokes = strokes;
		this.version = version;
	}
	
	

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

	
	public String getName() {
		return name;
	}

	
	public String getType() {
		return type;
	}

	
	public String getNumber() {
		return number;
	}

	
	public double getVersion() {
		return version;
	}

	
	public String getCompany() {
		return company;
	}

	public int getStrokes() {
		return strokes;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public void setType(String type) {
		this.type = type;
	}

	
	public void setNumber(String number) {
		this.number = number;
	}

	
	public void setVersion(double version) {
		this.version = version;
	}

	
	public void setCompany(String company) {
		this.company = company;
	}

	@Qualifier("4")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}
	

}
