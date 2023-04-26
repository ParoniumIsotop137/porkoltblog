package com.porkoltblog.PorkoltController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	public Porkolt createPorkolt(Porkolt porkolt) {
		return service.createPorkolt(porkolt);
		
	}
}
