package com.xworkz.mavenSpring.dao;

import org.springframework.stereotype.Component;

import com.xworkz.mavenSpring.dto.FirstAidDto;

@Component
public class FirstAidDAOImpl implements FirstAidDAO {

	@Override
	public boolean save(FirstAidDto firstAidDto) {
		System.out.println("data starting to save   ");
		return true;
	}

}