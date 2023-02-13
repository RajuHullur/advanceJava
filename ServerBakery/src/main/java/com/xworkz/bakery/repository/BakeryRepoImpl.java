package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.Dto.BakeryDTO;

@Repository
public class BakeryRepoImpl implements BakeryRepo {

	public BakeryRepoImpl() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}
	@Override
	public boolean save(BakeryDTO bakeryDTO) {
		System.out.println("Running Save");
		return false;
	}
}
