package com.courier.serviceimpl;

import java.sql.DatabaseMetaData;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courier.dao.DashboardDao;
import com.courier.jpa.DashboardMetaDataJpaInterface;
import com.courier.persistent.DashboardMetaData;
import com.courier.pojo.DashboardMetaDatapOJO;
import com.courier.service.DashboardService;

@Service
public class DashboardServiceImpl implements DashboardService{

	@Autowired
	private DashboardMetaDataJpaInterface dashboardMetaDataJpaInterface;
	
	@Autowired
	private DashboardDao dashboardDao;
	
	@Override
	public DashboardMetaDatapOJO saveDashboardMetaDatapOJO(DashboardMetaDatapOJO dashboardMetaDatapOJO) {
		DashboardMetaData dbDasb = new DashboardMetaData(dashboardMetaDatapOJO);
		System.out.println(dashboardMetaDatapOJO);
		System.out.println(dbDasb);
		dbDasb = dashboardMetaDataJpaInterface.save(dbDasb);
		DashboardMetaDatapOJO pojo = new DashboardMetaDatapOJO(dbDasb);
		System.out.println(pojo);
		return pojo;
	}

	@Override
	public List<DashboardMetaDatapOJO> getListDashboardMetaDatapOJO() {
		List<DashboardMetaData> listDatabaseData = dashboardDao.getDatabaseMetaDataList();
		return listDatabaseData.stream().map(appList -> new DashboardMetaDatapOJO(appList))
				.collect(Collectors.toList());
	}

}
