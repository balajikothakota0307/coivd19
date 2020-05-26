package com.spring.covidproject.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state_wise_daily_data")
public class StateWiseDailyCases {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	@Column(name = "state_code")
	private String code;
	private Integer active_cases;
	private Integer deaths;
	private Integer confirmed_cases;
	private Integer new_deaths;
	private Integer recovered_cases;
	private Integer new_confirmed_cases;
	private Integer new_recovered_cases;
	private Date date;
	
	

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
	public String getState_code() {
		return code;
	}

	/**
	 * @param state_code the state_code to set
	 */
	public void setState_code(String state_code) {
		this.code = state_code;
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
	 * @return the new_deaths
	 */
	public Integer getNew_deaths() {
		return new_deaths;
	}

	/**
	 * @param new_deaths the new_deaths to set
	 */
	public void setNew_deaths(Integer new_deaths) {
		this.new_deaths = new_deaths;
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
	 * @return the new_recovered_cases
	 */
	public Integer getNew_recovered_cases() {
		return new_recovered_cases;
	}

	/**
	 * @param new_recovered_cases the new_recovered_cases to set
	 */
	public void setNew_recovered_cases(Integer new_recovered_cases) {
		this.new_recovered_cases = new_recovered_cases;
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
