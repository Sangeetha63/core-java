package com.xworkz.springProperties.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
	@ComponentScan("com.xworkz.springProperties")
	public class SpringConfiguration {
		
		public SpringConfiguration() {
			System.out.println("created Configuration ");
		}
		
		@Bean
		public int newNumber() {
			System.out.println("registering number ");
			return 3;
		}
		
		@Bean
		public String owner() {
			System.out.println("registering owner by spring");
			String refOfOwner = new String("sangee");
			return refOfOwner;
		}
		@Bean
		public String NewspaperName() {
			System.out.println("registering NewspaperName ");
			String refOfName = new String("mysore mithra");
			return refOfName;
		}
		@Bean
		public String language() {
			System.out.println("registering language ");
			String refOfLanguage = new String("kannada");
			return refOfLanguage;
		}
		@Bean
		public short getPrice() {
			System.out.println("registering price");
			return 3;
		}
		@Bean
		public String engineName() {
			System.out.println("registering engineName ");
			String refOfEnginename = new String("petrolEngine");
			return refOfEnginename;
		}
		@Bean
		public String engineType() {
			System.out.println("registering type by spring");
			String refOfType = new String("external");
			return refOfType;
		}
		@Bean
		public String number() {
			System.out.println("registering number by spring");
			String refOfNumber = new String("DE23");
			return refOfNumber;
		}
		@Bean
		public double version() {
			System.out.println("registering version");
			return 5.2;
		}
		@Bean
		public String engineCompany() {
			System.out.println("registering company by spring");
			String refOfCompany = new String("Tayota");
			return refOfCompany;
		}
		@Bean
		public int strokes() {
			System.out.println("registerig strokes ");
			return 4;
		}
		@Bean
		public String snakeName() {
			System.out.println("registering snakeName by spring");
			String refOfSnakeName = new String("brown snake");
			return refOfSnakeName;
		}
		@Bean
		public double length() {
			System.out.println("registering length ");
			return 17;
		}
		@Bean
		public String colour() {
			System.out.println("registering color");
			return "green";
		}
		@Bean
		public String snakeType() {
			System.out.println("registering type ");
			return "waterType";
		}
		@Bean
		public boolean poisionous() {
			System.out.println("registering poisionous ");
			return true;
		}
		@Bean
		public String FatherName() {
			System.out.println("registering name by spring");
			return "jagadeesh";
		}
		
		
		@Bean
		public int height() {
			System.out.println("registering height by spring");
			return 7;
		}
		@Bean
		public int hands() {
			System.out.println("registering hands by spring");
			return 2;
		}
		@Bean
		public int legs() {
			System.out.println("registering legs by spring");
			return 3;
		}
		@Bean
		public boolean flying() {
			System.out.println("registering flying by spring");
			return true;
		}
		@Bean
		public float nailLength() {
			System.out.println("registering nailLength by spring");
			return 4.5f;
		}
		@Bean
		public String color() {
			System.out.println("registering colour by spring");
			return "red";
		}
		@Bean
		public LocalDate localdate() {
			System.out.println("registering localdate by spring");
			return LocalDate.of(2023, 01, 24);
		}
		@Bean
		public String GhostJuice() {
			System.out.println("registering ghostJuice by spring");
			String refOfGhostJuice = new String("apple");
			return refOfGhostJuice;
		}
		@Bean
		public String ghostMotherName() {
			System.out.println("registering ghostMotherName by spring");
			return "nayana";
		}
		
		@Bean
		public boolean house() {
			System.out.println("registering house by spring");
			return true;
		}
		@Bean
		public String maneColor() {
			System.out.println("registerinng maneColor by spring");
			return "blue";
		}
		@Bean
		public boolean noClean() {
			System.out.println("registering noClean by spring");
			return false;
		}
		@Bean
		public long phone() {
			System.out.println("registering phone by spring");
			return 423456778;
		}
		@Bean
		public boolean ghostNight() {
			System.out.println("registering ghostNight by spring");
			return true;
		}
		@Bean
		public String ghostAdress() {
			System.out.println("registering ghostAdress by spring");
			return "samadhi";
		}
		

	}


