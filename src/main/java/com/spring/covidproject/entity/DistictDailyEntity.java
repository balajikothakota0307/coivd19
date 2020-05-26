package com.spring.covidproject.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="district_wise_daily_data")
public class DistictDailyEntity {
	
	@Id
	private Integer ID;
	@Column(name="state_code")
	private Integer code;
	private String district_name;
	private String notes;
	private Integer active_cases;
	private Integer deaths;
	private Integer confirmed_cases;
	private Integer recovered_cases;
	private Integer new_confirmed_cases;
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
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
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
