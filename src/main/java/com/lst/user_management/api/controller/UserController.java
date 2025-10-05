package com.lst.user_management.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    /* 작성자 : 
     * 함수 설명 :
     */
    @GetMapping("/users")
    public String listUser() {

        return "All users Data";
    }
}
