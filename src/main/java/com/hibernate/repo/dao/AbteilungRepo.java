package com.hibernate.repo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.entities.Abteilung;

public interface AbteilungRepo extends JpaRepository<Abteilung, Integer> {
	
	@Modifying
	@Transactional
	@Query("update Abteilung a set a.kapazitaet = :x where a.idAbteilung = :y")
	public void updatekapazitaet(@Param("x")int kapazitaet ,@Param("y")int id);
	
	@Query("select a from Abteilung a where a.name like :x")
	public List<Abteilung> findAbtName(@Param("x")String name);
}

