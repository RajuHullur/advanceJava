package com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.Dto.BakeryDTO;
import com.xworkz.bakery.repository.BakeryRepo;

@Service
public class BakeryServiceImpl implements BakeryService {

	@Autowired
	private BakeryRepo bakaryRepository;

	
	@Override
	public boolean validatAndSave(BakeryDTO bakeryDTO) {
		System.out.println("Running validateAndSave");
		boolean save = bakaryRepository.save(bakeryDTO);
		System.out.println("Save " + save);
		return false;
	}

}

