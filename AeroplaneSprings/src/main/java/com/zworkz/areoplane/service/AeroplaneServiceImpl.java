package com.zworkz.areoplane.service;

import java.util.Collections;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zworkz.areoplane.dto.AeroplaneDTO;
import com.zworkz.areoplane.entityDTO.AeroplaneEntityDTO;
import com.zworkz.areoplane.repository.AeroplaneRepo;

@Service
public class AeroplaneServiceImpl implements AeroplaneService {

	@Autowired
	private AeroplaneRepo aeroplaneRepo;

	public AeroplaneServiceImpl() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroplaneDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto:" + dto);
			return violations;

		} else {
			System.out.println("ConstraintViolations does not exsit dta is good");

			AeroplaneEntityDTO aeroplaneEntityDTO = new AeroplaneEntityDTO();

			aeroplaneEntityDTO.setName(dto.getName());
			aeroplaneEntityDTO.setCompany(dto.getCompany());
			aeroplaneEntityDTO.setCost(dto.getCost());
			boolean saved = this.aeroplaneRepo.save(aeroplaneEntityDTO);
			System.out.println("Entity data is saved:" + saved);
			return Collections.emptySet();

		}
	}

	@Override
	public AeroplaneEntityDTO findById(int id) {
		if (id > 0) {
			AeroplaneEntityDTO aeroplaneEntityDTO = this.aeroplaneRepo.findById(id);
			if (aeroplaneEntityDTO != null) {
				System.out.println("entity is found in service for id" + id);
				AeroplaneEntityDTO aDto = new AeroplaneEntityDTO();
				aDto.setName(aeroplaneEntityDTO.getName());
				return aDto;
			}
		}

		return AeroplaneService.super.findById(id);
	}

}
