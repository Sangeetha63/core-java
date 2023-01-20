package com.xworkz.mavenSpring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.mavenSpring.dao.SoldierDAO;
import com.xworkz.mavenSpring.dto.SoldierDTo;

public class SoldierServiceImpl implements SoldierService {

	private SoldierDAO soldierDAO;

	public SoldierServiceImpl() {
		System.out.println("Created no-args const of SoldierServiceImpl..");
	}

	public void setSoldierRepo(SoldierDAO soldierRepo) {
		this.soldierDAO = soldierDAO;
	}

	@Override
	public boolean validateAndSave(SoldierDTo dto) {
		System.out.println("Starting validateAndSave");
		System.out.println("dto passed :" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTo>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.err.println("There are validation errors");
			violations.forEach(v -> {
				System.err.println("Violating message " + v.getMessage());
			});
			return false;
		} else {
			System.out.println("Data is valid..");

			return true;
		}
	}
}


