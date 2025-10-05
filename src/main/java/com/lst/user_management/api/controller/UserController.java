package com.lst.user_management.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")

public class UserController {

    /* 작성자 : lst
     * 함수 설명 : users의 모든 데이터를 리턴
     */
    @GetMapping("/users")
    public String listUser() {

        return "All users Data";
    }
}
