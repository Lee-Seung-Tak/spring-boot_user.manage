package com.lst.user_management.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class WebController {

    /* 작성자 : lst
     * 함수 설명 : 기본 8080 주소로 접속 시 main 화면 리턴 하는 함수
     */
    @GetMapping("/")
    public String index() {
        return "index"; // /WEB-INF/views/index.jsp
    }

    /* 작성자 : lst
     * 함수 설명 : 기본 8080/users 주소로 접속 시 사용자 리스트 화면 리턴 하는 함수
     */
    @GetMapping("/users")
    public String users() {
        return "user-list"; // /WEB-INF/views/user-list.jsp
    }

}
