package com.esprit.microservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservices.entity.Voituree;
import com.esprit.microservices.repository.VoitureeRepository;

@Service
public class VoitureeService {
	
	@Autowired
	private VoitureeRepository vr;
	
	public Voituree addVoituree(Voituree a) {
		return vr.save(a);
	}
    
	public String updateVoituree( Voituree newVoi) {
		if(vr.findById(newVoi.getId()).isPresent()) {
			Voituree existingVoituree = vr.findById(newVoi.getId()).get();
			Long oldId=existingVoituree.getId();
			existingVoituree=newVoi;
			existingVoituree.setId(oldId);
		
			 vr.save(existingVoituree);
			 return "updated";
		}else
			return null;
	}
	
	public String deleteVoituree(Long id) {
		if (vr.findById( id).isPresent()) {
			vr.deleteById( id);
			return " Voituree Supprimé ";
		}else 
			return "Voituree non supprimé";
	}

	public List<Voituree> getAllVoiturees()
	{
		return vr.findAll();
	}
	
	public Voituree findVoituree(Long id)
	{ 
		return vr.findById(id).orElse(null);
	}
	
}