package com.spring.covidproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.covidproject.Dao.Respose_Realtime_state;

@SpringBootApplication
public class CovidProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidProjectApplication.class, args);
	}
	
	@Bean
	public Respose_Realtime_state realtime() {
		return new Respose_Realtime_state();
	}

}
