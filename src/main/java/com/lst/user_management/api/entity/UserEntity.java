package com.lst.user_management.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_account")
@Getter // getter 자동 생성
@Setter // setter 자동 생성
@NoArgsConstructor // 기본 생성자 자동 생성
@AllArgsConstructor // 모든 필드를 받는 생성자 자동 생성
@Builder // 빌더 패턴 자동 생성 (원하시면 생략 가능)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "user_pw", nullable = false)
    private String userPw;

    @Column(name = "user_email")
    private String userEmail;

    private String phone;
    private String address;

    @Column(name = "create_dt", updatable = false)
    private LocalDateTime createDt;

    @Column(name = "update_dt")
    private LocalDateTime updateDt;

    @PrePersist
    protected void onCreate() {
        this.createDt = LocalDateTime.now();
        this.updateDt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updateDt = LocalDateTime.now();
    }
}
