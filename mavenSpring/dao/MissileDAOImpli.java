package com.xworkz.mavenSpring.dao;

import org.springframework.stereotype.Component;

import com.xworkz.mavenSpring.dto.MissileDto;

@Component
public class MissileDAOImpli  implements MissileDAO{

	@Override
	public boolean save(MissileDto missileDto) {
		System.out.println("Missile repositery created "+ missileDto);
		return true;
	}

}