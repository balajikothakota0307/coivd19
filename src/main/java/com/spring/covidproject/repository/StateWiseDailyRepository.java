package com.spring.covidproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.covidproject.entity.StateWiseDailyCases;

@Repository
public interface StateWiseDailyRepository extends JpaRepository<StateWiseDailyCases, Integer> {
	
	

}
