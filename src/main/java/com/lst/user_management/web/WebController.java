package com.lst.user_management.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class WebController {

    /* 작성자 : 
     * 함수 설명 :
     */
    @GetMapping("/")
    public String index() {
        return "index"; // /WEB-INF/views/index.jsp
    }

    @GetMapping("/users")
    public String users() {
        return "user-list"; // /WEB-INF/views/user-list.jsp
    }

}
