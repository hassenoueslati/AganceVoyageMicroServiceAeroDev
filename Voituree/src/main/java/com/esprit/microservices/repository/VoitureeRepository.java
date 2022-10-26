package com.esprit.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.microservices.entity.Voituree;

@Repository
public interface VoitureeRepository extends JpaRepository <Voituree, Long> {

}