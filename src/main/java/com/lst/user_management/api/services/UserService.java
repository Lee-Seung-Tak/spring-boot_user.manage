package com.lst.user_management.api.services;

import com.lst.user_management.api.dto.UserDto;
import com.lst.user_management.api.entity.UserEntity;
import com.lst.user_management.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service // 스프링이 서비스 빈으로 관리하도록 등록
@RequiredArgsConstructor // final 필드 자동 생성자 주입
public class UserService {

    private final UserRepository userRepository; // 생성자 주입 (스프링 권장 방식)

    /**
     * 전체 사용자 조회 (Entity → DTO 변환)
     */
    public List<UserDto> getAllUsers() {
        // 1️. Repository에서 Entity 리스트 조회
        List<UserEntity> entities = userRepository.findAll();

        // 2️. Entity → DTO 변환
        return entities.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    /**
     * Entity → DTO 변환 메서드
     */
    private UserDto convertToDto(UserEntity entity) {
        return UserDto.builder()
                .userId(entity.getUserId())
                .userEmail(entity.getUserEmail())
                //필요한 필드 모두 매핑
                .build();
    }
}
