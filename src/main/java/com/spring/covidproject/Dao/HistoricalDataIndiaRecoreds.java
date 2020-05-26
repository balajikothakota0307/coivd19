package com.spring.covidproject.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HistoricalDataIndiaRecoreds {
	
	private String status;
	private List<HistoricalDataIndia> records;
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
	 * @return the records
	 */
	public List<HistoricalDataIndia> getRecords() {
		return records;
	}
	/**
	 * @param records the records to set
	 */
	public void setRecords(List<HistoricalDataIndia> records) {
		this.records = records;
	}

}
