package com.xworkz.forest.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.forest.ForestEntityDTO.ForestEntityDTO;

public class ForestRunner {
	
	  public static void main(String[] args) {
		
		   EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		   EntityManager manager=factory.createEntityManager();
		   Query query=manager.createNamedQuery("findByName");
		   Object object=query.getSingleResult();
		   ForestEntityDTO dto=(ForestEntityDTO)object;
		   System.out.println(dto);
		   manager.close();
	   
	  }	  
}
