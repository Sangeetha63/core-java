package com.xworkz.springautowire.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
	@ComponentScan("com.xworkz.autowire")
	public class AutowireConfiguration {
		public AutowireConfiguration() {
			System.out.println("Running Constructor AutoWired");
		}

		@Bean("ownerName")

		public String HardwareShopOwnerName() {
			return "sangeetha";
		}

		@Bean("address")
		public String HardwareShopAddress() {
			return "Banglore";
		}

		@Bean("name")

		public String HardwareShopName()

		{
			return "nandi Hardware Shop";
		}

		@Bean("id")
		public int HardwareShopId() {

			return 10;
		}

		@Bean("gstNo")
		public String HardwareShopGstNo() {
			return "GSTIN202253456";
		}

		@Bean("developer")

		public String softwareDeveloper() {
			return "Java Developer";
		}

		@Bean("name")

		public String softwareName() {
			return "ravi";
		}

		@Bean("version")

		public String softwareVersion() {
			return "v1.8";

		}

		@Bean("free")

		public Boolean softwareFree() {
			return true;
		}

		@Bean("date")

		public LocalDate softwareDate() {
			return LocalDate.now();
		}

		@Bean("engineername")

		public String softwareEngineerName() {
			return "sangeetha";
		}

		@Bean("engineerCompany")

		public String softwareEngineerCompany() {
			return "infofsy";
		}

		@Bean("engineerSalary")

		public Double softwareEngineerSalary() {
			return 32453D;
		}

		@Bean("experience")
		public int softwareEngineerExpperience() {
			return 2;
		}

		@Bean("color")
		public String pencilColor() {
			return "Red";
		}

		@Bean("Pencilname")

		public String pencilName() {
			return "Nataraj";
		}

		@Bean("type")
		public String penciltype() {
			return "Writing";
		}

		@Bean("pencilprice")
		public Double pencilPrice() {
			return 20.6;
		}

		@Bean("Sharp")
		public Boolean pencilSharp() {
			return false;
		}

		@Bean("stolen")
		public Boolean pencilStolen() {
			return false;
		}

		@Bean("rubberStolen")
		public Boolean rubberStolen() {
			return false;
		}

		@Bean("rubberName")
		public String rubberName() {
			return "Apsara";
		}

		@Bean("rubberType")
		public String rubberType() {
			return "Rubber";
		}

		@Bean("rubberColor")
		public String rubberColor() {
			return "White";
		}

		@Bean("rubberShape")
		public String rubberShape() {
			return "Square";
		}

		@Bean("rubberSize")
		public int rubberSize() {
			return 2;
		}

		@Bean("rubberPrice")
		public double rubberPrice() {
			return 102.0;
		}

		@Bean("bookName")
		public String bookName() {
			return "baskara";
		}

		@Bean("bookAddress")
		public String bookAddress() {
			return "Bengalore";
		}

		@Bean("bookOwnerName")
		public String bookOwnerName() {
			return "hema";
		}

		@Bean("bookState")
		public String bookState() {
			return "Karnataka";
		}

		@Bean("bookProduct")
		public String bookProduct() {
			return "Bread";
		}
		
		@Bean("workers")
		public int bookNoOfWorkers()
		{
			return 10;
		}
		
		@Bean("area")
		public String bookArea()
		{
			return "Kelmbelli";
		}
		
		@Bean("bookPinCode")
		public int bookPinCode()
		{
			return 577542;
		}
		@Bean("bookDate")
		public LocalDate bookdate()
		{
			return LocalDate.now();
		}
	}


