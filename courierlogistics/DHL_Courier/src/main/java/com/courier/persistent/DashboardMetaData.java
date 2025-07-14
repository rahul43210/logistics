package com.courier.persistent;

import java.time.LocalDate;

import com.courier.pojo.DashboardMetaDatapOJO;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DashboardMetaData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true)
	private Integer id;
	
	private String governmentRegisteredLLceneseNumber;
	
	@JsonFormat(pattern = "yyyy/MM/dd")
	private LocalDate establishedDate;
	
	private String registeredCityName;
	
	private String registeredAddress;
	
	private Long officeNumber;
	

	private String gSTNumber;

	

	public DashboardMetaData() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DashboardMetaData(DashboardMetaDatapOJO dashboardMetaDatapOJO) {
		super();
		setId(dashboardMetaDatapOJO.getId());
		setGovernmentRegisteredLLceneseNumber(dashboardMetaDatapOJO.getGovernmentRegisteredLLceneseNumber());
		setEstablishedDate(dashboardMetaDatapOJO.getEstablishedDate());
		setgSTNumber(dashboardMetaDatapOJO.getgSTNumber());
		setRegisteredCityName(dashboardMetaDatapOJO.getRegisteredCityName());
		setRegisteredAddress(dashboardMetaDatapOJO.getRegisteredAddress());
		setOfficeNumber(dashboardMetaDatapOJO.getOfficeNumber());
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
