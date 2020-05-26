package com.spring.covidproject.Dao;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class DistictWiseRealDataDao {

	private String state_code;
	private String district;
	private Integer notes;
	private Integer active_cases;
	private Integer confirmed_cases;
	private Integer recoverd_cases;
	private Integer new_confirmed_cases;
	private Integer deaths;
	private Timestamp last_update_time;

	public DistictWiseRealDataDao() {
		// TODO Auto-generated constructor stub
	}

	public DistictWiseRealDataDao(String state_code, String district, Integer notes, Integer active_cases,
			Integer confirmed_cases, Integer recoverd_cases, Integer new_confirmed_cases, Integer deaths,
			Timestamp last_update_time) {
		super();
		this.state_code = state_code;
		this.district = district;
		this.notes = notes;
		this.active_cases = active_cases;
		this.confirmed_cases = confirmed_cases;
		this.recoverd_cases = recoverd_cases;
		this.new_confirmed_cases = new_confirmed_cases;
		this.deaths = deaths;
		this.last_update_time = last_update_time;
	}

	/**
	 * @return the state_code
	 */
	public String getState_code() {
		return state_code;
	}

	/**
	 * @param state_code the state_code to set
	 */
	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the notes
	 */
	public Integer getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(Integer notes) {
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
	 * @return the recoverd_cases
	 */
	public Integer getRecoverd_cases() {
		return recoverd_cases;
	}

	/**
	 * @param recoverd_cases the recoverd_cases to set
	 */
	public void setRecoverd_cases(Integer recoverd_cases) {
		this.recoverd_cases = recoverd_cases;
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
	 * @return the last_update_time
	 */
	public Timestamp getLast_update_time() {
		return last_update_time;
	}

	/**
	 * @param last_update_time the last_update_time to set
	 */
	public void setLast_update_time(Timestamp last_update_time) {
		this.last_update_time = last_update_time;
	}

}
