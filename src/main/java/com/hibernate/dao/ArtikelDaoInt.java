package com.hibernate.dao;

import java.util.List;

import com.hibernate.entities.*;

public interface ArtikelDaoInt{

	public Artikel save(Artikel art);
	public Artikel find(int id);
	public void delete(int id);
	public Artikel update(Artikel art);
	public List<Artikel> getAll();
}
