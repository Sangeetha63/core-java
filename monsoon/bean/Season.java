package com.xworkz.monsoon.bean;

import java.time.Month;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Season {
	String name;
	int duration;
	Month staringMonth;
	public Season() {
		System.out.println("creating season");
	}
	public Season(@Value("Rain")String name,@Value("4") int duration, @Value("Month.JUNE")Month staringMonth) {
		super();
		this.name = name;
		this.duration = duration;
		this.staringMonth = staringMonth;
	}
	@Override
	public String toString() {
		return "Season [name=" + name + ", duration=" + duration + ", staringMonth=" + staringMonth + "]";
	}
	
	}
	


