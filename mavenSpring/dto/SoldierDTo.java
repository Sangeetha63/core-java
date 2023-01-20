package com.xworkz.mavenSpring.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	@ToString
	
	public class SoldierDTo extends AbstractAuditDTO {
		@NotNull
		@NotBlank
		@Size(min = 3,max = 20,message = "Name must be > 3 and < 20")
		private String name;
		@Min(value = 0,message = "Id must be greater than zero..")
		@Max(value = 10000)
		private int id;
		@NotNull
		@NotBlank
		@Size(min = 4,max = 30,message = "rank must be > 4 and < 30")
		private String rank;
		@NotNull
		@NotBlank
		@Size(min = 5,max = 40,message = "batallion must be > 5 and < 40")
		private String batallion;
		@NotNull
		@NotBlank
		@Size(min = 5,max = 50,message = "country must be > 5 and < 50")
		private String country;

	}