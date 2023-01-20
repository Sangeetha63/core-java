package com.xworkz.mavenSpring.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractAuditDTO implements Serializable {

	private String createdby;
	private LocalDateTime createdAt;
	private String updatedby;
	private LocalDateTime updatedAt;

}

