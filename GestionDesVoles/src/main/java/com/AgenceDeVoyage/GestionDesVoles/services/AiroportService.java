package com.AgenceDeVoyage.GestionDesVoles.services;

import java.util.List;

import com.AgenceDeVoyage.GestionDesVoles.entity.Airoport;

public interface AiroportService {
 Airoport AddAiroport(Airoport airoport);
 List<Airoport> GetAllAiroport();

void deleteAiroport(Long idAiroport);
Airoport updateAiroport(Airoport air);
Airoport retrieveAiroportById(Long idAiroport);



}
