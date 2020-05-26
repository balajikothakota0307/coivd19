package com.spring.covidproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.covidproject.entity.DistictDailyEntity;

@Repository
public interface DistictDailyRepository extends JpaRepository<DistictDailyEntity, Integer>{

	List<DistictDailyEntity> findByCode(Integer code);
}
