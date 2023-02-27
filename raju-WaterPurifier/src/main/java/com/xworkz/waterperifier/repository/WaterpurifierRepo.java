package com.xworkz.waterperifier.repository;

import com.xworkz.waterperifier.EntityDTO.WaterpurifierEntityDTO;

public interface WaterpurifierRepo {
	 boolean save(WaterpurifierEntityDTO entity);
 
	  default  WaterpurifierEntityDTO findById(int id) {
		  return null;
	  }
}
