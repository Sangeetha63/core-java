package com.xworkz.springProperties.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;
@Component
public class Ghost {
	private String Childname;
	private String food;
	private int height;
	private int hands;
	private int legs;
	private boolean blood;
	private float nailLength;
	private String address;
	private LocalDate dateOfDeath;
	private String colour;
	
	@Autowired
	@Qualifier("jaga")
	private String grandFather;
	
	@Autowired
	@Qualifier("ultaKaalu")
	private boolean grandMother;
	
	@Autowired
	@Qualifier("jasmine")
	private String flower;
	
	@Autowired
	@Qualifier("earth")
	private boolean house;
	
	@Autowired
	@Qualifier("true")
	private boolean fiying;
	
	@Autowired
	@Qualifier("clean")
	private boolean neatness;
	
	@Autowired
	@Qualifier("2345142622")
	private long mobile;
	
	@Autowired
	@Qualifier("samaadhi")
	private String graveyard;
	
	@Autowired
	@Qualifier("red")
	private String juice;
	
	@Autowired
	@Qualifier("true")
	private boolean night;

	public Ghost(@Qualifier("sangu")String childname, @Qualifier("non veg")String food, @Qualifier("4.5")int height,
			@Qualifier("2") int hands, @Qualifier("4")int legs,@Qualifier("red") boolean blood,
			@Qualifier("3.6")float nailLength,
			@Qualifier("tree")String address,@Qualifier("LocalDate.of(2023, 11, 06)") LocalDate dateOfDeath,@Qualifier("red") String colour, String grandFather, boolean grandMother,
			String flower, boolean house, boolean fiying, boolean neatness, long mobile, String graveyard, String juice,
			boolean night) {
		super();
		Childname = childname;
		this.food = food;
		this.height = height;
		this.hands = hands;
		this.legs = legs;
		this.blood = blood;
		this.nailLength = nailLength;
		this.address = address;
		this.dateOfDeath = dateOfDeath;
		this.colour = colour;
		this.grandFather = grandFather;
		this.grandMother = grandMother;
		this.flower = flower;
		this.house = house;
		this.fiying = fiying;
		this.neatness = neatness;
		this.mobile = mobile;
		this.graveyard = graveyard;
		this.juice = juice;
		this.night = night;
	}

	@Override
	public String toString() {
		return "Ghost [Childname=" + Childname + ", food=" + food + ", height=" + height + ", hands=" + hands
				+ ", legs=" + legs + ", blood=" + blood + ", nailLength=" + nailLength + ", address=" + address
				+ ", dateOfDeath=" + dateOfDeath + ", colour=" + colour + ", grandFather=" + grandFather
				+ ", grandMother=" + grandMother + ", flower=" + flower + ", house=" + house + ", fiying=" + fiying
				+ ", neatness=" + neatness + ", mobile=" + mobile + ", graveyard=" + graveyard + ", juice=" + juice
				+ ", night=" + night + "]";
	}
	
	
	
}








