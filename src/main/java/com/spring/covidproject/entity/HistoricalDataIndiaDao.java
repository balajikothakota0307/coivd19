package com.spring.covidproject.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="daily_totalcases_india")
public class HistoricalDataIndiaDao {
	
	@Id
	private Date date_of_record;
	private Integer deaths;
	private Integer total_deaths;
	private Integer confirmed_cases;
	private Integer total_confirmed_cases;
	private Integer recovered_cases;
	private Integer total_recoverd_cases;
	/**
	 * @return the date_of_record
	 */
	public Date getDate_of_record() {
		return date_of_record;
	}
	/**
	 * @param date_of_record the date_of_record to set
	 */
	public void setDate_of_record(Date date_of_record) {
		this.date_of_record = date_of_record;
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
	 * @return the total_deaths
	 */
	public Integer getTotal_deaths() {
		return total_deaths;
	}
	/**
	 * @param total_deaths the total_deaths to set
	 */
	public void setTotal_deaths(Integer total_deaths) {
		this.total_deaths = total_deaths;
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
	 * @return the total_confirmed_cases
	 */
	public Integer getTotal_confirmed_cases() {
		return total_confirmed_cases;
	}
	/**
	 * @param total_confirmed_cases the total_confirmed_cases to set
	 */
	public void setTotal_confirmed_cases(Integer total_confirmed_cases) {
		this.total_confirmed_cases = total_confirmed_cases;
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
	 * @return the total_recoverd_cases
	 */
	public Integer getTotal_recoverd_cases() {
		return total_recoverd_cases;
	}
	/**
	 * @param total_recoverd_cases the total_recoverd_cases to set
	 */
	public void setTotal_recoverd_cases(Integer total_recoverd_cases) {
		this.total_recoverd_cases = total_recoverd_cases;
	}
	
	

}
