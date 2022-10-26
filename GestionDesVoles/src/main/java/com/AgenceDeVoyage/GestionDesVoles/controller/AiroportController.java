package com.AgenceDeVoyage.GestionDesVoles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.AgenceDeVoyage.GestionDesVoles.entity.Airoport;
import com.AgenceDeVoyage.GestionDesVoles.services.AiroportServiceImpl;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/airoport")
public class AiroportController {

	
	@Autowired
	AiroportServiceImpl airoportServiceImpl ;
	
	
	
	@PostMapping("/add-airoport")
	@ResponseBody
	public Airoport AddAiroport(@RequestBody Airoport air) {
		Airoport Airoport = airoportServiceImpl.AddAiroport(air);
		return Airoport;
	}
	
	@ResponseBody
	@GetMapping("/getAll")
	public List<Airoport> getAiroport() {
		List<Airoport> listAiroports = airoportServiceImpl.GetAllAiroport();
		return listAiroports ;
	}
	
	@ResponseBody
	@PutMapping("/update-airoport")
	public Airoport UpdateAiroport(@RequestBody Airoport idair) {
	    return	airoportServiceImpl.updateAiroport(idair);
	}
	
	@DeleteMapping("/remove-Airoport/{idair}")
	@ResponseBody
	public void removeAiroport(@PathVariable("idair") Long idair) {
		airoportServiceImpl.deleteAiroport(idair);
	}
}
