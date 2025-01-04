package com.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.entity.AdminNotiEntity;


public interface NotiRepository extends JpaRepository<AdminNotiEntity, Long>{
	
	
}
