package com.xworkz.springProperties.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	@Qualifier("1")
	int id;
	String name;
	String ownerName;
	@Autowired
	@Qualifier("Kannada")
	String language;
	
    double price;
    
    public NewsPaper() {
    	System.out.println("creating newspaper");
    }
    
	public NewsPaper(@Qualifier("vijay karnataka")String name,@Qualifier("Sangeetha") String ownerName,int id,String language) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.id=id;
		this.language=language;
		this.price= price;
	}
	

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}

	
	
	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	
	public String getOwnerName() {
		return ownerName;
	}

	
	public String getLanguage() {
		return language;
	}

	
	public double getPrice() {
		return price;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	
	public void setLanguage(String language) {
		this.language = language;
	}

	@Qualifier("5")
	public void setPrice(double price) {
		this.price = price;
	}
    
    
    

}
