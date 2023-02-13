package com.xworkz.bakery.repository;

import com.xworkz.bakery.Dto.BakeryDTO;

public interface BakeryRepo {

	boolean save(BakeryDTO bakeryDTO);
}


//1 DTO --data and constructor / getter &setter
//2 Repo -- interface save   &  Bakery DTO impl 
//3 Sevice  --  interface validateAndSave &  Service impl
//4 Controller - Add Attribute and @PostMapping 
//5 Configuration--@Configuration &  @ComponentScan("com.xworkz.bakery") impl


//