package com.porkoltblog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.porkoltblog.entity.Porkolt;

@Service
public interface IPorkoltService {

	public List<Porkolt> getPorkoltek();
	public Porkolt createPorkolt(Porkolt porkolt);
	public Porkolt getPorkolt(Long id);
	public Porkolt updatePorkolt(Porkolt porkolt, Long id);
	
}
