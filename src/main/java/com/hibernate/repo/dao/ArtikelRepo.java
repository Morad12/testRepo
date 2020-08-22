package com.hibernate.repo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.entities.Artikel;

public interface ArtikelRepo extends JpaRepository<Artikel, Integer> {

}
