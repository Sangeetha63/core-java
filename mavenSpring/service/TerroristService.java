package com.xworkz.mavenSpring.service;

import com.xworkz.mavenSpring.dto.TerroristDTO;

public interface TerroristService {
	
	boolean validateAndSave(TerroristDTO dto);

}
