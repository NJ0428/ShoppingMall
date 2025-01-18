package com.mall.service;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mall.dto.AdminNotiDTO;

@SpringBootTest
public class Notitest {
	@Autowired
    private AdminNotiServicelmpl notiService;

	@Test
	void contextLoads() {
		// Given
        AdminNotiDTO adminNotiDTO = AdminNotiDTO.builder()
                .mQnaTitle("테스트 공지사항 제목")
                .mQnaCntt("테스트 공지사항 내용")
                .mQnaDt(LocalDateTime.now())
                .mQnaStatus("WAIT")
                .build();

        // When
        AdminNotiDTO savedDTO = notiService.save(adminNotiDTO);
        
        System.out.println(notiService.getAllNotices());
        
	}
}
