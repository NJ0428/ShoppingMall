package com.mall.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity//이 클래스가 엔티티임을 표시
@Getter//getter 메서드 자동 생성
@Setter//Setter 메서드 자동 생성
@Builder//Builder 패턴을 자동으로 생성해주는 기능
@AllArgsConstructor//클래스의 모든 필드를 초기화하는 생성자를 자동으로 생성
@NoArgsConstructor//클래스에 기본 생성자를 자동으로 생성
@ToString//객체의 필드 값을 문자열로 표현
@Table(name = "admin_noti")
public class AdminNotiEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_qna_no")
    private Long mQnaNo;

    @Column(name = "m_qna_title")
    private String mQnaTitle;

    @Column(name = "m_qna_cntt")
    private String mQnaCntt;

    @Column(name = "m_qna_dt")
    private LocalDateTime mQnaDt;

    @Column(name = "m_qna_status")
    private String mQnaStatus;

    @Column(name = "m_qna_q_ans")
    private String mQnaQAns;

    @Column(name = "m_qna_q_id_dt")
    private LocalDateTime mQnaQIdDt;
}
