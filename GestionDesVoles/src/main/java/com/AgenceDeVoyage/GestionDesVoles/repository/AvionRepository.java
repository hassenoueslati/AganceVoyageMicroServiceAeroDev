package com.AgenceDeVoyage.GestionDesVoles.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AgenceDeVoyage.GestionDesVoles.entity.Avion;

@Repository
public interface AvionRepository extends CrudRepository<Avion,Long>{

}
