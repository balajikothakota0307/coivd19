package com.spring.covidproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.covidproject.entity.DistictWiseRealDataEntity;

@Repository
public interface DistictRealRepository extends JpaRepository<DistictWiseRealDataEntity, String>{
	
	List<DistictWiseRealDataEntity> findByCode(String distict);

}
