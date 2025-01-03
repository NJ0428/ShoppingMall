package com.mall.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder//Builder 패턴을 자동으로 생성해주는 기능
@NoArgsConstructor//클래스에 기본 생성자를 자동으로 생성
@AllArgsConstructor//클래스의 모든 필드를 초기화하는 생성자를 자동으로 생성
@Data//@Getter, `@설정@Setter, @EqualsAndHashCode, @ToString, `@NoAr@NoArgsConstructor, @AllArgsConstructor 등의 Lombok 어노테이션을 모두 자동으로 적용
public class AdminNotiDTO {
    private Long mQnaNo;          // 문의 번호
    private String mQnaTitle;     // 문의 제목
    private String mQnaCntt;      // 문의 내용
    private LocalDateTime mQnaDt; // 문의 작성일자
    private String mQnaStatus;    // 문의 상태
    private String mQnaQAns;      // 답변 내용
    private LocalDateTime mQnaQIdDt; // 답변 작성일자
}
