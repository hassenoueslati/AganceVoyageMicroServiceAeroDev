package com.AgenceDeVoyage.GestionDesVoles.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AgenceDeVoyage.GestionDesVoles.entity.Airoport;

@Repository
public interface AiroportRepository extends CrudRepository<Airoport, Long>{

}
