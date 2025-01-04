package com.mall.service;

import org.springframework.stereotype.Service;

import com.mall.dto.AdminNotiDTO;
import com.mall.entity.AdminNotiEntity;
import com.mall.repository.NotiRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminNotiServicelmpl {
	private final NotiRepository notiRepository;
    /**
     * 공지사항 저장
     */
    public AdminNotiDTO save(AdminNotiDTO adminNotiDTO) {
        AdminNotiEntity savedEntity = notiRepository.save(adminNotiDTO.toEntity());
        return AdminNotiDTO.fromEntity(savedEntity);  // 저장 후 DTO로 변환해서 반환
    }
	
}
