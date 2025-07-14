package com.courier.dao;

import java.sql.DatabaseMetaData;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.courier.jpa.DashboardMetaDataJpaInterface;
import com.courier.persistent.DashboardMetaData;

@Repository
public class DashboardDao {

	@Autowired
	private DashboardMetaDataJpaInterface dashboardMetaDataJpaInterface;

	public List<DashboardMetaData> getDatabaseMetaDataList() {
		// TODO Auto-generated method stub
		return dashboardMetaDataJpaInterface.findAll();
	}
	
	
	
}
