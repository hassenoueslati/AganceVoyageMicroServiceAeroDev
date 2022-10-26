package com.AgenceDeVoyage.GestionDesVoles.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgenceDeVoyage.GestionDesVoles.entity.Avion;
import com.AgenceDeVoyage.GestionDesVoles.repository.AvionRepository;

@Service
public class AvionServiceImpl  implements AvionService{

	
	@Autowired
	AvionRepository avionRepository;
	@Override
	public void AddAvion(Avion avion) {
		avionRepository.save(avion);
       
	}

}
