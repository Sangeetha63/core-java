package com.xworkz.springautowire.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("version")
	private String Version;
	@Autowired
	@Qualifier("developer")
	private String developer;
	@Autowired
	@Qualifier("date")
	private LocalDate date;
	@Autowired
	@Qualifier("free")
	private Boolean free;

	@Override
	public String toString() {
		return "Software [name=" + name + ", Version=" + Version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}

	
	public String getName() {
		return name;
	}

	
	public String getVersion() {
		return Version;
	}

	public String getDeveloper() {
		return developer;
	}

	public LocalDate getDate() {
		return date;
	}

	
	public Boolean getFree() {
		return free;
	}

	


}