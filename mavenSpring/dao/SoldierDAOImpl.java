package com.xworkz.mavenSpring.dao;

import com.xworkz.mavenSpring.dto.SoldierDTo;

public class SoldierDAOImpl implements SoldierDAO {
	
	public SoldierDAOImpl() {
		System.out.println("Created SoldierRepoImpl no-args const..");
	}

	@Override
	public boolean save(SoldierDTo dto) {
		System.out.println("running Save");
		System.out.println("Dto "+ dto);
		return false;
	}

}



