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


	@Override
	public Porkolt createPorkolt(Porkolt porkolt) {
		return pRepo.save(porkolt);
	}
	
	
}
