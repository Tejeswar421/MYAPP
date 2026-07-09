package com.example.security.logincontroller;


import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/userlogin")
//    @ResponseBody(alredy exist in @RestController)
    public String LoginControllers() {

        return "user login is success";

    }

//    @GetMapping("/csrftoken")
//    public CsrfToken csrf(HttpServletRequest request) {
//        return (CsrfToken)request.getAttribute("_csrf");
//    }

}
