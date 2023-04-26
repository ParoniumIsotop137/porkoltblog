package com.porkoltblog.PorkoltController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.porkoltblog.entity.Porkolt;
import com.porkoltblog.service.PorkoltService;



@Controller
public class PorkoltController {
	
	@Autowired
	PorkoltService service;
	
	@RequestMapping("/porkoltblog")
	public String PorkoltBolog(Model model) {
		
		model.addAttribute("porkoltek", getReceptek());
		return "porkoltblog";
		
	}
	
	public List<Porkolt> getReceptek(){
		return service.getPorkoltek();
		
	}
	
	@PostMapping("/mentes")
	public Porkolt createPorkolt(@RequestBody Porkolt porkolt) {
		return service.createPorkolt(porkolt);
		
	}
	@GetMapping("/kereses/{id}")
	public Porkolt getPorkolt(@PathVariable Long id) {
		return service.getPorkolt(id);
		
	}
	
	@PutMapping("/{id}")
	public Porkolt updatePorkolt( @RequestBody Porkolt porkolt, @PathVariable Long id) {
		return service.updatePorkolt(porkolt, id);
		
	}
	
}
