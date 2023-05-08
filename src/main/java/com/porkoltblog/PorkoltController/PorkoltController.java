package com.porkoltblog.PorkoltController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.porkoltblog.entity.Porkolt;
import com.porkoltblog.service.PorkoltService;



@RestController
@RequestMapping("/porkoltblog")
public class PorkoltController {
	
	@Autowired
	PorkoltService service;
	/*
	@RequestMapping("/porkoltblog")
	public String PorkoltBolog(Model model) {
		
		model.addAttribute("porkoltek", getReceptek());
		return "porkoltblog";
		
	}
	*/
	@GetMapping("/porkoltlista")
	public List<Porkolt> getReceptek(){
		return service.getPorkoltek();
		
	}
	
	@PostMapping("/mentes")
	public Porkolt createPorkolt( @RequestBody Porkolt porkolt) {
		return service.createPorkolt(porkolt);
		
	}
	@GetMapping("/getporkolt/{id}")
	public Porkolt getPorkolt(@PathVariable Long id) {
		return service.getPorkolt(id);
		
	}
	
	@PutMapping("/{id}")
	public Porkolt updatePorkolt( @RequestBody Porkolt porkolt, @PathVariable Long id) {
		return service.updatePorkolt(porkolt, id);
		
	}
	
}
