package com.courier.pojo;

import java.time.LocalDate;

import com.courier.persistent.DashboardMetaData;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

 
public class DashboardMetaDatapOJO {

 
	private Integer id;
	
	private String governmentRegisteredLLceneseNumber;
	
	@JsonFormat(pattern = "yyyy/MM/dd") 
	private LocalDate establishedDate;
	
	private String registeredCityName;
	
	private String registeredAddress;
	
	private Long officeNumber;
	
	private String gSTNumber;

	/*
	 * public DashboardMetaDatapOJO(Integer id, String
	 * governmentRegisteredLLceneseNumber, LocalDate establishedDate, String
	 * registeredCityName, String registeredAddress, Long officeNumber, String
	 * gSTNumber) { super(); this.id = id; this.GovernmentRegisteredLLceneseNumber =
	 * governmentRegisteredLLceneseNumber; this.establishedDate = establishedDate;
	 * this.registeredCityName = registeredCityName; this.registeredAddress =
	 * registeredAddress; this.officeNumber = officeNumber; this.GSTNumber =
	 * gSTNumber; }
	 */

	public DashboardMetaDatapOJO() {
		super();
 
	}

	

	public DashboardMetaDatapOJO(DashboardMetaData dashboardMetaData) {
		super();
			
		setId(dashboardMetaData.getId());
		setGovernmentRegisteredLLceneseNumber(dashboardMetaData.getGovernmentRegisteredLLceneseNumber());
		setEstablishedDate(dashboardMetaData.getEstablishedDate());
		setRegisteredCityName(dashboardMetaData.getRegisteredCityName());
		setRegisteredAddress(dashboardMetaData.getRegisteredAddress());
		setOfficeNumber(dashboardMetaData.getOfficeNumber());
		setgSTNumber(dashboardMetaData.getgSTNumber()); 
	}


	
	 

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getGovernmentRegisteredLLceneseNumber() {
		return governmentRegisteredLLceneseNumber;
	}



	public void setGovernmentRegisteredLLceneseNumber(String governmentRegisteredLLceneseNumber) {
		this.governmentRegisteredLLceneseNumber = governmentRegisteredLLceneseNumber;
	}



	public LocalDate getEstablishedDate() {
		return establishedDate;
	}



	public void setEstablishedDate(LocalDate establishedDate) {
		this.establishedDate = establishedDate;
	}



	public String getRegisteredCityName() {
		return registeredCityName;
	}



	public void setRegisteredCityName(String registeredCityName) {
		this.registeredCityName = registeredCityName;
	}



	public String getRegisteredAddress() {
		return registeredAddress;
	}



	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}



	public Long getOfficeNumber() {
		return officeNumber;
	}



	public void setOfficeNumber(Long officeNumber) {
		this.officeNumber = officeNumber;
	}



	public String getgSTNumber() {
		return gSTNumber;
	}



	public void setgSTNumber(String gSTNumber) {
		this.gSTNumber = gSTNumber;
	}



	public String toString() {
		return getId()+" "+getGovernmentRegisteredLLceneseNumber()+" "+getgSTNumber()+" "+getRegisteredAddress()
			+" "+getRegisteredCityName()+" "+getOfficeNumber()+" "+getEstablishedDate();
	}
	
}
