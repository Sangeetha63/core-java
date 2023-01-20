package com.xworkz.mavenSpring.dao;

import org.springframework.stereotype.Component;

import com.xworkz.mavenSpring.dto.ResortDTo;

@Component
public class ResortDAOImpli implements ResortDAO {

	@Override
	public boolean save(ResortDTo dto) {
		System.out.println("created Resort repo and invoked save");
		System.out.println("saved data" + dto);
		return true;
	}

}