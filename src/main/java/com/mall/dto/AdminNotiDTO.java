package com.mall.dto;

import java.time.LocalDateTime;

import com.mall.entity.AdminNotiEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//@Getter, `@설정@Setter, @EqualsAndHashCode, @ToString, `@NoAr@NoArgsConstructor, @AllArgsConstructor 등의 Lombok 어노테이션을 모두 자동으로 적용
@Builder//Builder 패턴을 자동으로 생성해주는 기능
@NoArgsConstructor//클래스에 기본 생성자를 자동으로 생성
@AllArgsConstructor//클래스의 모든 필드를 초기화하는 생성자를 자동으로 생성
public class AdminNotiDTO {
    private Long mQnaNo;          // 문의 번호
    private String mQnaTitle;     // 문의 제목
    private String mQnaCntt;      // 문의 내용
    private LocalDateTime mQnaDt; // 문의 작성일자
    private String mQnaStatus;    // 문의 상태
    private String mQnaQAns;      // 답변 내용
    private LocalDateTime mQnaQIdDt; // 답변 작성일자
    
    /**
     * DTO -> Entity 변환 메서드
     */
    public AdminNotiEntity toEntity() {
        return AdminNotiEntity.builder()
                .mQnaNo(this.mQnaNo)
                .mQnaTitle(this.mQnaTitle)
                .mQnaCntt(this.mQnaCntt)
                .mQnaDt(this.mQnaDt)
                .mQnaStatus(this.mQnaStatus)
                .mQnaQAns(this.mQnaQAns)
                .mQnaQIdDt(this.mQnaQIdDt)
                .build();
    }

    /**
     * Entity -> DTO 변환 메서드
     */
    public static AdminNotiDTO fromEntity(AdminNotiEntity entity) {
        return AdminNotiDTO.builder()
                .mQnaNo(entity.getMQnaNo())
                .mQnaTitle(entity.getMQnaTitle())
                .mQnaCntt(entity.getMQnaCntt())
                .mQnaDt(entity.getMQnaDt())
                .mQnaStatus(entity.getMQnaStatus())
                .mQnaQAns(entity.getMQnaQAns())
                .mQnaQIdDt(entity.getMQnaQIdDt())
                .build();
    }
}
