package com.hibernate.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "AbteilungTable")
public class Abteilung implements Serializable {
	private static final long serialVersionUID = -1876766594024599649L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idAbteilung;
	
	@Column(length = 30)
	private String name;
	
	private Integer kapazitaet;
	
	@OneToMany(mappedBy = "whichAbt", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE/*, cascade = CascadeType.ALL, orphanRemoval = true*/)
	private Collection<Artikel> artikel;

	public Abteilung() {
		super();
	}

	public Abteilung(String name, Integer kapazitaet, Collection<Artikel> artikel) {
		super();
		this.name = name;
		this.kapazitaet = kapazitaet;
		this.artikel = artikel;
	}
	
	public Abteilung(String name, Integer kapazitaet) {
		super();
		this.name = name;
		this.kapazitaet = kapazitaet;
	}

	public Integer getIdAbteilung() {
		return idAbteilung;
	}

	public void setIdAbteilung(Integer idAbteilung) {
		this.idAbteilung = idAbteilung;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getKapazitaet() {
		return kapazitaet;
	}

	public void setKapazitaet(Integer kapazitaet) {
		this.kapazitaet = kapazitaet;
	}

	public Collection<Artikel> getArtikel() {
		return artikel;
	}

	public void setArtikel(Collection<Artikel> artikel) {
		this.artikel = artikel;
	}
}
