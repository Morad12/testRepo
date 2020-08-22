package com.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.entities.Artikel;

@Repository
@Transactional
public class ArtikelDaoImp implements ArtikelDaoInt {

	@PersistenceContext
	EntityManager em;

	@Override
	public Artikel save(Artikel art) {
		em.persist(art);
		return art;
	}
	
	@Override
	public Artikel find(int id) {
		return em.find(Artikel.class, id);
	}

	@Override
	public void delete(int id) {
		em.remove(find(id));		
	}

	@Override
	public Artikel update(Artikel art) {
		return em.merge(art);
	}

	@Override
	public List<Artikel> getAll() {
		Query qry = em.createQuery("select a from Artikel a");		
		return qry.getResultList();
	}
}
