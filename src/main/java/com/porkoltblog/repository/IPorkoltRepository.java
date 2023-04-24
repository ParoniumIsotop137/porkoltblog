package com.porkoltblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.porkoltblog.entity.Porkolt;

public interface IPorkoltRepository extends JpaRepository<Porkolt, Long>{

}
