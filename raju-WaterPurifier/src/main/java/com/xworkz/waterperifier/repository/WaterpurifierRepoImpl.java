package com.xworkz.waterperifier.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.waterperifier.EntityDTO.WaterpurifierEntityDTO;
@Repository
public class WaterpurifierRepoImpl implements WaterpurifierRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public WaterpurifierRepoImpl() {
		System.out.println("Created :"+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(WaterpurifierEntityDTO entity) {
		System.out.println("Running saveWaterpurifierEntityDTO ");
		  
		EntityManager em=this.entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;
	}
	@Override
	public WaterpurifierEntityDTO findById(int id) {
		System.out.println("Fing by id Repo:"+id);
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		WaterpurifierEntityDTO wdto=entityManager.find(WaterpurifierEntityDTO.class,id);
		entityManager.close();
		return wdto;
	}
	

}
