package com.ghaith.combats.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Combat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCombat;
	private String nomj1;
	private String nomj2;
	private Integer scorej1;
	private Integer scorej2;
	private Date dateCombat;
	@ManyToOne
	private Categorie categorie;

	public Combat() {
		super();
	}

	public Combat(String nomj1, String nomj2, Integer scorej1, Integer scorej2, Date dateCombat) {
		super();
		this.nomj1 = nomj1;
		this.nomj2 = nomj2;
		this.scorej1 = scorej1;
		this.scorej2 = scorej2;
		this.dateCombat = dateCombat;
	}

	public Long getIdCombat() {
		return idCombat;
	}

	public void setIdCombat(Long idCombat) {
		this.idCombat = idCombat;
	}

	public String getNomj1() {
		return nomj1;
	}

	public void setNomj1(String nomj1) {
		this.nomj1 = nomj1;
	}

	public String getNomj2() {
		return nomj2;
	}

	public void setNomj2(String nomj2) {
		this.nomj2 = nomj2;
	}

	public Integer getScorej1() {
		return scorej1;
	}

	public void setScorej1(Integer scorej1) {
		this.scorej1 = scorej1;
	}

	public Integer getScorej2() {
		return scorej2;
	}

	public void setScorej2(Integer scorej2) {
		this.scorej2 = scorej2;
	}

	public Date getDateCombat() {
		return dateCombat;
	}

	public void setDateCombat(Date dateCombat) {
		this.dateCombat = dateCombat;
	}

	@Override
	public String toString() {
		return "Combat [idCombat=" + idCombat + ", nomj1=" + nomj1 + ", nomj2=" + nomj2 + ", scorej1=" + scorej1
				+ ", scorej2=" + scorej2 + ", dateCombat=" + dateCombat + "]";
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
