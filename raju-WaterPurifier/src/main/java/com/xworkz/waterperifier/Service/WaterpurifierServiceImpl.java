package com.xworkz.waterperifier.Service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.waterperifier.EntityDTO.WaterpurifierEntityDTO;
import com.xworkz.waterperifier.WaterpurifierDTO.WaterpurifierDTO;
import com.xworkz.waterperifier.repository.WaterpurifierRepo;
@Service
public class WaterpurifierServiceImpl implements WaterpurifierService {
	
	
	@Autowired
	public WaterpurifierRepo waterpurifierRepo;
	
	public WaterpurifierServiceImpl() {
		System.out.println("Created :"+this.getClass().getSimpleName());
	}
	
	@Override
	public Set<ConstraintViolation<WaterpurifierDTO>>validateAndSave(WaterpurifierDTO dto) {
		System.out.println("running validateAndSave..");
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<WaterpurifierDTO>> violation = validator.validate(dto);
		if(violation != null && !violation.isEmpty()) {
			System.err.println("Violation in dto " + dto);
			return violation;
		}
		else {
			System.out.println("violation is not in dto, can save" );
			WaterpurifierEntityDTO entity = new WaterpurifierEntityDTO();
			entity.setName(dto.getName());
			entity.setBrand(dto.getBrand());
			entity.setColor(dto.getColor());
			entity.setMaterial(dto.getMaterial());
			entity.setCapacity(dto.getCapacity());
			
			boolean saved = this.waterpurifierRepo.save(entity);
			System.out.println("Entity is saved " + saved);
			return Collections.emptySet();
		}
	}
	@Override
	public WaterpurifierDTO findById(int id) {
		if(id>0) {
			WaterpurifierEntityDTO waterpurifierEntityDTO=this.waterpurifierRepo.findById(id);
			if(waterpurifierEntityDTO!=null) {
				System.out.println("entity is found in service for id:"+id);
				WaterpurifierDTO wDto=new WaterpurifierDTO();
				wDto.setName(waterpurifierEntityDTO.getName());
				wDto.setBrand(waterpurifierEntityDTO.getBrand());
				wDto.setColor(waterpurifierEntityDTO.getColor());
				wDto.setMaterial(waterpurifierEntityDTO.getMaterial());
				wDto.setCapacity(waterpurifierEntityDTO.getCapacity());
				//wDto.setId(waterpurifierEntityDTO.getId());
				return wDto;
			}
		}
		return WaterpurifierService.super.findById(id);

}
}
