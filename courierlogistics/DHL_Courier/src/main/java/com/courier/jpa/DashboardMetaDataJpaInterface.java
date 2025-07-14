package com.courier.jpa;

import java.beans.JavaBean;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.courier.persistent.DashboardMetaData;

@Repository
public interface DashboardMetaDataJpaInterface extends JpaRepository<DashboardMetaData,Integer>{
	

}
