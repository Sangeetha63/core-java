package com.xworkz.mavenSpring.boot;

import com.xworkz.mavenSpring.dto.TerroristDTO;
import com.xworkz.mavenSpring.service.TerroristService;
import com.xworkz.mavenSpring.service.TerroristServiceImpl;



public class TerroristRunner {
	  
	public static void main(String[] args) {
		TerroristDTO dto = new TerroristDTO();
		dto.setName("nandi");
		dto.setAge(32);
		dto.setAlive(true);
		dto.setCountry("India");
		dto.setOrganization("Organization");
		dto.setPrison(false);
		dto.setSpecialization("dance");
		System.out.println(dto);
		
		TerroristService service = new TerroristServiceImpl();
		service.validateAndSave(dto);
	}

}



