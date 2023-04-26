package com.porkoltblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.porkoltblog.entity.Porkolt;
import com.porkoltblog.repository.IPorkoltRepository;
@Service
public class PorkoltService implements IPorkoltService{

	@Autowired
	IPorkoltRepository pRepo;

	
	public List<Porkolt> getPorkoltek() {
	
		return pRepo.findAll();
	}


	
	public Porkolt createPorkolt(Porkolt porkolt) {
		return pRepo.save(porkolt);
	}


	
	public Porkolt getPorkolt(Long id) {
		
		return pRepo.findById(id).orElseThrow();
	}



	public Porkolt updatePorkolt(Porkolt porkolt, Long id) {
		
		Porkolt oldRecipe = pRepo.findById(id).orElseThrow();
		
		oldRecipe.setId(id);
		oldRecipe.setIngredients(porkolt.getIngredients());
		oldRecipe.setName(porkolt.getName());
		oldRecipe.setRecipe(porkolt.getRecipe());
		
		pRepo.save(oldRecipe);
		return oldRecipe;
	}
	
	
}
