package com.xworkz.mavenSpring.service;

import com.xworkz.mavenSpring.dto.MissileDto;

public interface MissileService {
	boolean validateAndSave(MissileDto dto);

}