package com.mall.service;

import java.util.List;
import java.util.stream.Collectors;

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
    
    /**
     * 공지사항 전체 조회
     */
    public List<AdminNotiDTO> getAllNotices() {
        List<AdminNotiEntity> entities = notiRepository.findAll();
        return entities.stream()
                .map(AdminNotiDTO::fromEntity)  // Entity -> DTO 변환
                .collect(Collectors.toList());
    }

    /**
     * 공지사항 단일 조회
     */
    public AdminNotiDTO getNoticeById(Long id) {
        AdminNotiEntity entity = notiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("공지사항을 찾을 수 없습니다."));
        return AdminNotiDTO.fromEntity(entity);  // Entity -> DTO 변환
    }
	
}
