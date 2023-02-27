package com.zworkz.areoplane.repository;

import com.zworkz.areoplane.entityDTO.AeroplaneEntityDTO;

public interface AeroplaneRepo {
	public boolean save(AeroplaneEntityDTO entity);

	default AeroplaneEntityDTO findById(int id) {

		return null;
	}
}
