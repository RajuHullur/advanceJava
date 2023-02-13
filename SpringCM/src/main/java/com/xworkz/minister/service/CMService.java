package com.xworkz.minister.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.minister.cmdto.CMDTO;

public interface CMService {
	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto);
}