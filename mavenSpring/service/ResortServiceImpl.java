package com.xworkz.mavenSpring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.mavenSpring.dao.ResortDAO;
import com.xworkz.mavenSpring.dto.ResortDTo;



@Component
public class ResortServiceImpl implements ResortService {
	private ResortDAO resortDAO;
	private Validator validator;

	public ResortServiceImpl(ResortDAO resortDAO, Validator validator) {
		super();
		this.resortDAO = resortDAO;
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(ResortDTo dto) {
		System.out.println("Data started to validate in Resort");
		Set<ConstraintViolation<ResortDTo>> violence = validator.validate(dto);
		if (!violence.isEmpty()) {
			System.out.println("There is error in code");
			violence.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		} else {
			boolean saved = resortDAO.save(dto);
			System.out.println("saved" + saved);
			return saved;
		}

	}

}