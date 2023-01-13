package com.xworkz.springProperties.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Snake {
	String name;
	@Autowired
	@Qualifier("3.6")
	double length;
	@Autowired
	@Qualifier("black")
	String colour;
	String type;
	Boolean posisionous;
	
	public Snake() {
		System.out.println("creating snake");
	}
	
	public Snake(@Qualifier("cobra")String name, double length, String colour, @Qualifier("Ophiophagus")String type,@Qualifier("yes") Boolean posisionous) {
		super();
		this.name = name;
		this.length = length;
		this.colour = colour;
		this.type = type;
		this.posisionous = posisionous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", colour=" + colour + ", type=" + type + ", posisionous="
				+ posisionous + "]";
	}

	
	public String getName() {
		return name;
	}

	
	public double getLength() {
		return length;
	}

	
	public String getColour() {
		return colour;
	}

	
	public String getType() {
		return type;
	}

	
	public Boolean getPosisionous() {
		return posisionous;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public void setLength(double length) {
		this.length = length;
	}

	
	public void setColour(String colour) {
		this.colour = colour;
	}

	
	public void setType(String type) {
		this.type = type;
	}

	
	public void setPosisionous(Boolean posisionous) {
		this.posisionous = posisionous;
	}
	
	
	}
	
	


