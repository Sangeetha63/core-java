package com.xworkz.mavenSpring.service;

import com.xworkz.mavenSpring.dto.FirstAidDto;

public interface FirstAidService {

	boolean validateAndSave(FirstAidDto dto);

}