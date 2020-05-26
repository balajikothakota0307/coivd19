package com.spring.covidproject.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.covidproject.entity.HistoricalDataIndiaDao;

@Repository
public interface HistoricalDataIndiaRepository extends JpaRepository<HistoricalDataIndiaDao, Date>{
	

}
