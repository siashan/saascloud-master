package com.han.saascloud.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2019/4/3 9:27
 * @Modified By:
 */
@RestController
@RequestMapping("sysuser")
public class SysUserController {

    @GetMapping("test")
    public Object test() {
        System.out.println("服务提供者");
        return "ok";
    }
}
