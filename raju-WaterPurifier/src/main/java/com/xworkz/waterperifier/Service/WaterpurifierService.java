package com.xworkz.waterperifier.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.waterperifier.WaterpurifierDTO.WaterpurifierDTO;

public interface WaterpurifierService {
	Set<ConstraintViolation<WaterpurifierDTO>> validateAndSave(WaterpurifierDTO dto);
  
	default  WaterpurifierDTO findById(int id) {
		return null;
	}
}
