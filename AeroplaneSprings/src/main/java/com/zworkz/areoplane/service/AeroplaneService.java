package com.zworkz.areoplane.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.zworkz.areoplane.dto.AeroplaneDTO;
import com.zworkz.areoplane.entityDTO.AeroplaneEntityDTO;

public interface AeroplaneService {
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO dto);

	default AeroplaneEntityDTO findById(int id) {
		return null;
	}

}
