package com.xworkz.mavenSpring.boot;

import com.xworkz.mavenSpring.dao.SoldierDAO;
import com.xworkz.mavenSpring.dao.SoldierDAOImpl;
import com.xworkz.mavenSpring.dto.SoldierDTo;
import com.xworkz.mavenSpring.service.SoldierServiceImpl;

public class SoldierRunner {
public static void main(String[] args) {
		
		SoldierDTo dto = new SoldierDTo("Sangu", 1 ,"Topper", "education", "Nagar");
		SoldierServiceImpl service = new SoldierServiceImpl();
		SoldierDAO dao = new SoldierDAOImpl();
		service.setSoldierRepo(dao);
		service.validateAndSave(dto);

	}

}
