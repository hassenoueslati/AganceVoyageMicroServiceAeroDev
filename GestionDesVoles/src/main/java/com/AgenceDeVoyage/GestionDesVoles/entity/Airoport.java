package com.AgenceDeVoyage.GestionDesVoles.entity;

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
@Table( name = "Airoport")
public class Airoport {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idAiroport")
	private Long idAiroport;
	private  String nomAiroport;
	private String surface;
	private String Localisation ;

	
	
	public Airoport() {
		super();
	}

	public Airoport(Long idAiroport, String nomAiroport, String surface, String localisation) {
		super();
		this.idAiroport = idAiroport;
		this.nomAiroport = nomAiroport;
		this.surface = surface;
		Localisation = localisation;
	}

	public Airoport(String nomAiroport) {
		super();
		this.nomAiroport = nomAiroport;
	}
	
	public Long getIdAiroport() {
		return idAiroport;
	}
	public void setIdAiroport(Long idAiroport) {
		this.idAiroport = idAiroport;
	}
	public String getNomAiroport() {
		return nomAiroport;
	}
	public void setNomAiroport(String nomAiroport) {
		this.nomAiroport = nomAiroport;
	}
	public String getSurface() {
		return surface;
	}
	public void setSurface(String surface) {
		this.surface = surface;
	}
	public String getLocalisation() {
		return Localisation;
	}
	public void setLocalisation(String localisation) {
		Localisation = localisation;
	}

	

}
