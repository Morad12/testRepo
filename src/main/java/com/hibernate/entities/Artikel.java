package com.hibernate.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "ArtikelTable")
public class Artikel implements Serializable{
	private static final long serialVersionUID = -6918995605110575202L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long idArtikel;
	
	@Column(length = 30)
	private String name;
	
	@Column(unique = true)
	private Long artikelNr;
	
	private Double preis;
	
	@ManyToOne/*(cascade = CascadeType.PERSIST)*/
	@JoinColumn(name = "Id_Abt")
	private Abteilung whichAbt;

	public Artikel() {
		super();
	}

	public Artikel(String name, Long artikelNr, Double preis, Abteilung whichAbt) {
		super();
		this.name = name;
		this.artikelNr = artikelNr;
		this.preis = preis;
		this.whichAbt = whichAbt;
	}

	public Long getIdArtikel() {
		return idArtikel;
	}

	public void setIdArtikel(Long idArtikel) {
		this.idArtikel = idArtikel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getArtikelNr() {
		return artikelNr;
	}

	public void setArtikelNr(Long artikelNr) {
		this.artikelNr = artikelNr;
	}

	public Double getPreis() {
		return preis;
	}

	public void setPreis(Double preis) {
		this.preis = preis;
	}

	public Abteilung getWhichAbt() {
		return whichAbt;
	}

	public void setWhichAbt(Abteilung whichAbt) {
		this.whichAbt = whichAbt;
	}
	
	
}
