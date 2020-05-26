package com.spring.covidproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.covidproject.entity.State_wise_rt_data;

@Repository
public interface State_wise_data_repository extends JpaRepository<State_wise_rt_data, String>{
	
	
	State_wise_rt_data findByCode(String code);

}
