package com.courier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courier.DhlCourierApplication;
import com.courier.pojo.DashboardMetaDatapOJO;
import com.courier.pojo.ResponsePojo;
import com.courier.service.DashboardService;

@RestController
@RequestMapping("/app")
public class DashboardController {

	private final DhlCourierApplication dhlCourierApplication;

	@Autowired
	private DashboardService dashboardService;
	
    DashboardController(DhlCourierApplication dhlCourierApplication) {
        this.dhlCourierApplication = dhlCourierApplication;
    }
	
	@GetMapping("/intro")
	public ResponsePojo applicationSoftwareVersion() {
		return new ResponsePojo(HttpStatus.OK.value(),"OK");
	}
	
	@PostMapping("/save/metadata")
    public DashboardMetaDatapOJO 
  							saveDashboardMetaData(@RequestBody  DashboardMetaDatapOJO dashboardMetaDatapOJO) {
	  return dashboardService.saveDashboardMetaDatapOJO(dashboardMetaDatapOJO);
	}
	
	@GetMapping("/list/metadata")
    public List<DashboardMetaDatapOJO> 
  							getListDashboardMetaData() {
	  return dashboardService.getListDashboardMetaDatapOJO();
  }
}
