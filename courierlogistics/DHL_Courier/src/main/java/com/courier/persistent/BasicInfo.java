package com.courier.persistent;

import java.util.List;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BASIC_INFO")
public class BasicInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;
	
	private String establishName;
	
	private String organizationName;
	
	private String parent_company_name;
	
	private String registrationNumber;
	
	private List<String> listBranchLocation;
	
}
