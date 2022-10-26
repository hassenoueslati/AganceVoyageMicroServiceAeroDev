package com.AgenceDeVoyage.GestionDesVoles.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgenceDeVoyage.GestionDesVoles.entity.Airoport;
import com.AgenceDeVoyage.GestionDesVoles.repository.AiroportRepository;


@Service
public class AiroportServiceImpl implements AiroportService{

	 @Autowired
	 AiroportRepository airoportRepository;
	
	@Override
	public Airoport AddAiroport(Airoport airoport) {
		return airoportRepository.save(airoport);
		
	}

	@Override
	public List<Airoport>GetAllAiroport() {
		
		return (List<Airoport>) airoportRepository.findAll();
	}

	@Override
	public void deleteAiroport(Long idAiroport) {
		airoportRepository.deleteById(idAiroport);
		
	}

	@Override
	public Airoport updateAiroport(Airoport air) {
		return airoportRepository.save(air);

	}

	@Override
	public Airoport retrieveAiroportById(Long idAiroport) {
		return airoportRepository.findById(idAiroport).get();

	}

}
