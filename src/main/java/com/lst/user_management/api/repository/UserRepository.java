package com.lst.user_management.api.repository;

import com.lst.user_management.api.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // JpaRepository를 상속하면, 아래와 같은 기본적인 DB 접근 메서드가 자동으로 제공됩니다.
    // List<UserEntity> findAll();   // SELECT * FROM user_entity
    // UserEntity findById(Long id); // SELECT * FROM user_entity WHERE id = ?
    // <S extends UserEntity> S save(S entity); // INSERT 또는 UPDATE

    // 필요에 따라 여기에 사용자 정의 조회 메서드를 추가할 수 있습니다.
    // 예: UserEntity findByUserId(String userId); 
}