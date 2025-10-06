package com.lst.user_management.api.controller;

import com.lst.user_management.api.dto.UserDto;
import com.lst.user_management.api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 작성자 : lst  
     * 함수 설명 : 모든 사용자 조회 (GET /api/users)
     */
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users); 
    }
}
