package com.hibernate.dao;

import java.util.List;

import com.hibernate.entities.Abteilung;

public interface AbteilungDaoInt{
	
	public Abteilung save(Abteilung abt);
	public Abteilung find(int id);
	public void delete(int id);
	public Abteilung update(Abteilung abt);
	public List<Abteilung> getAll();
}
