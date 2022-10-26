package com.esprit.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.microservices.entity.Voituree;
import com.esprit.microservices.service.VoitureeService;

@RestController
@CrossOrigin
public class VoitureeController {
	@Autowired
	private VoitureeService vs;
	
	@PostMapping("/addVoituree")
    public Voituree saveVoituree(@RequestBody Voituree voi)
    {
    	return vs.addVoituree(voi);
    }
	
	@GetMapping("/Voiturees")
	public  List<Voituree>  FindAllVoituree()
	{
		return  vs.getAllVoiturees();
	}

	@DeleteMapping("/deleteVoituree/{id}")
    public String deleteVoituree(@PathVariable Long id)
    {
    	 vs.deleteVoituree(id);
    	 return "supprimer";
    }

	@GetMapping("/VoitureeById/{id}")
    public Voituree findVoitureeById(@PathVariable Long id) {
        return vs.findVoituree(id);
    }
	
	@PutMapping("/updateVoituree") 
    public String updateVoituree(@RequestBody Voituree bal) {
         vs.updateVoituree(bal);
         return "updated";
    }
	
}