package com.spring.covidproject.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ResposeDistictDataDao {
	
	private String status;
	private List<DistictDailyDao> data;
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
	public List<DistictDailyDao> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<DistictDailyDao> data) {
		this.data = data;
	}
	
}
