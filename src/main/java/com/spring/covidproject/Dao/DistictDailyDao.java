package com.spring.covidproject.Dao;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class DistictDailyDao {

	private Integer ID;
	private Integer state_code;
	private String district_name;
	private String notes;
	private Integer active_cases;
	private Integer deaths;
	private Integer confirmed_cases;
	private Integer recovered_cases;
	private Integer new_confirmed_cases;
	private Date date;
	
	public DistictDailyDao() {
		// TODO Auto-generated constructor stub
	}
	public DistictDailyDao(Integer iD, Integer state_code, String district_name, String notes, Integer active_cases,
			Integer deaths, Integer confirmed_cases, Integer recovered_cases, Integer new_confirmed_cases, Date date) {
		super();
		ID = iD;
		this.state_code = state_code;
		this.district_name = district_name;
		this.notes = notes;
		this.active_cases = active_cases;
		this.deaths = deaths;
		this.confirmed_cases = confirmed_cases;
		this.recovered_cases = recovered_cases;
		this.new_confirmed_cases = new_confirmed_cases;
		this.date = date;
	}
	/**
	 * @return the iD
	 */
	public Integer getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(Integer iD) {
		ID = iD;
	}
	
	/**
	 * @return the state_code
	 */
	public Integer getState_code() {
		return state_code;
	}
	/**
	 * @param state_code the state_code to set
	 */
	public void setState_code(Integer state_code) {
		this.state_code = state_code;
	}
	/**
	 * @return the district_name
	 */
	public String getDistrict_name() {
		return district_name;
	}
	/**
	 * @param district_name the district_name to set
	 */
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	/**
	 * @return the active_cases
	 */
	public Integer getActive_cases() {
		return active_cases;
	}
	/**
	 * @param active_cases the active_cases to set
	 */
	public void setActive_cases(Integer active_cases) {
		this.active_cases = active_cases;
	}
	/**
	 * @return the deaths
	 */
	public Integer getDeaths() {
		return deaths;
	}
	/**
	 * @param deaths the deaths to set
	 */
	public void setDeaths(Integer deaths) {
		this.deaths = deaths;
	}
	/**
	 * @return the confirmed_cases
	 */
	public Integer getConfirmed_cases() {
		return confirmed_cases;
	}
	/**
	 * @param confirmed_cases the confirmed_cases to set
	 */
	public void setConfirmed_cases(Integer confirmed_cases) {
		this.confirmed_cases = confirmed_cases;
	}
	/**
	 * @return the recovered_cases
	 */
	public Integer getRecovered_cases() {
		return recovered_cases;
	}
	/**
	 * @param recovered_cases the recovered_cases to set
	 */
	public void setRecovered_cases(Integer recovered_cases) {
		this.recovered_cases = recovered_cases;
	}
	/**
	 * @return the new_confirmed_cases
	 */
	public Integer getNew_confirmed_cases() {
		return new_confirmed_cases;
	}
	/**
	 * @param new_confirmed_cases the new_confirmed_cases to set
	 */
	public void setNew_confirmed_cases(Integer new_confirmed_cases) {
		this.new_confirmed_cases = new_confirmed_cases;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	



}
