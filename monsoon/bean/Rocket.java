package com.xworkz.monsoon.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Rocket {
	@Value("india")
	String country;
	@Value("GSLV")
	String name;
	@Value("300000")
	double price;
	
	public Rocket() {
		System.out.println("creating rocket constructor");
		
	}
	public Rocket(String country, String name, double price) {
		super();
		this.country = country;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Rocket [country=" + country + ", name=" + name + ", price=" + price + "]";
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
