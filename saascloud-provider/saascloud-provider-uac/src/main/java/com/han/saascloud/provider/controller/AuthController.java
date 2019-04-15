package com.han.saascloud.provider.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2019/4/8 17:01
 * @Modified By:
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("form1")
    public  Object form(HttpServletRequest request, HttpServletResponse response ,String username,String passward){

        return "form";
    }
}
