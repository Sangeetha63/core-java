package com.xworkz.springautowire.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BookShop {

	@Autowired
	@Qualifier("bookName")
	private String name;
	@Autowired
	@Qualifier("bookOwnerName")
	private String OwnerName;
	@Autowired
	@Qualifier("bookAddress")
	private String address;
	@Autowired
	@Qualifier("bookState")
	private String state;
	@Autowired
	@Qualifier("bookProduct")
	private String product;
	@Autowired
	@Qualifier("workers")
	private int noOfWorkres;
	@Autowired
	@Qualifier("bookDate")
	private LocalDate openDate;
	@Autowired
	@Qualifier("bookPinCode")
	private int pinCode;
	@Autowired
	@Qualifier("area")
	private String area;

	@Override
	public String toString() {
		return "BookShop [name=" + name + ", OwnerName=" + OwnerName + ", address=" + address + ", state=" + state
				+ ", products=" + product + ", noOfWorkres=" + noOfWorkres + ", openDate=" + openDate + ", pinCode="
				+ pinCode + ", area=" + area + "]";
	}



}
