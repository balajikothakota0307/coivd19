package com.spring.covidproject.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ResponseDailyStateDAO {
	
	private String status;
	private List<StateWiseDailyDAO> data;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the data
	 */
	public List<StateWiseDailyDAO> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<StateWiseDailyDAO> data) {
		this.data = data;
	}

}
