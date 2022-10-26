package com.AgenceDeVoyage.GestionDesVoles.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table( name = "Avion")
public class Avion implements Serializable {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idAvion")
	private Long idAvion;
	private String nomAvion;
	private String capacite;
	private Float Longeur;
	private Float Hauteur;
	private Float MasseAuDecollage ;
	private Float VitesseMaximum;
	
	public Avion(String nomAvion) {
		super();
		this.nomAvion = nomAvion;
	}

	public Avion(Long idAvion, String nomAvion, String capacite, Float longeur, Float hauteur, Float masseAuDecollage,
			Float vitesseMaximum) {
		super();
		this.idAvion = idAvion;
		this.nomAvion = nomAvion;
		this.capacite = capacite;
		Longeur = longeur;
		Hauteur = hauteur;
		MasseAuDecollage = masseAuDecollage;
		VitesseMaximum = vitesseMaximum;
	}

	public Avion() {
		super();
	}

	
}
