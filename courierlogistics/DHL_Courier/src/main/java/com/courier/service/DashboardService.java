package com.courier.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.courier.pojo.DashboardMetaDatapOJO;

public interface DashboardService {

	DashboardMetaDatapOJO saveDashboardMetaDatapOJO(DashboardMetaDatapOJO dashboardMetaDatapOJO);

	List<DashboardMetaDatapOJO> getListDashboardMetaDatapOJO();

}
