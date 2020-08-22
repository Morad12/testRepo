package com.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.*;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.entities.Abteilung;

@Repository
@Transactional
public class AbteilungDaoImp implements AbteilungDaoInt{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public Abteilung save(Abteilung abt) {
		em.persist(abt);
		return abt;
	}
	
	@Override
	public Abteilung find(int id) {
		// TODO Auto-generated method stub
		return em.find(Abteilung.class, id);
	}

	@Override
	public void delete(int id) {
		em.remove(find(id));		
	}

	@Override
	public Abteilung update(Abteilung abt) {
		return em.merge(abt);
	}

	@Override
	public List<Abteilung> getAll() {
		Query qry = em.createQuery("select a from Abteilung a");		
		return qry.getResultList();
	}
	
}
