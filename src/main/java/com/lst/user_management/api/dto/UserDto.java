package com.lst.user_management.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter, setter, toString, equals, hashCode 자동 생성
@Builder // 객체 생성 시 빌더 패턴 사용 가능
@NoArgsConstructor //  기본 생성자
@AllArgsConstructor // 전체 필드 생성자
public class UserDto {

    @NotBlank(message = "아이디는 필수입니다.")
    @Size(min = 4, max = 20, message = "아이디는 4자 이상 20자 이하로 입력하세요.")
    private String userId;

    @NotBlank(message = "비밀번호는 필수입니다.")
    @Size(min = 6, message = "비밀번호는 최소 6자 이상이어야 합니다.")
    private String userPw;

    @Email(message = "올바른 이메일 형식이어야 합니다.")
    private String userEmail;

    private String phone;
    private String address;
}
