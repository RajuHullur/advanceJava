package com.zworkz.areoplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zworkz.areoplane.entityDTO.AeroplaneEntityDTO;

@Repository
public class AeroplaneRepoImpl implements AeroplaneRepo {

	@Autowired
	public EntityManagerFactory EntityManagerFactory;

	public AeroplaneRepoImpl() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(AeroplaneEntityDTO entity) {
		EntityManager em = this.EntityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		et.commit();
		em.persist(entity);
		em.clear();
		return false;
	}

	@Override
	public AeroplaneEntityDTO findById(int id) {
		System.out.println("find by ID in Repo .." + id);

		EntityManager em = this.EntityManagerFactory.createEntityManager();
		AeroplaneEntityDTO aent = this.findById(id);
		em.close();
		return aent;

	}
}
