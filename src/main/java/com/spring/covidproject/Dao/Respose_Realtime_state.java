package com.spring.covidproject.Dao;

import java.util.List;

public class Respose_Realtime_state {
	
	private String status;
	private List<State_Wise_Realtime_Data> data;
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
	public List<State_Wise_Realtime_Data> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<State_Wise_Realtime_Data> data) {
		this.data = data;
	}
	

	
	

}
