package com.han.saascloud.provider.api.service;

import com.han.saascloud.provider.api.hystrix.UserServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2019/4/3 11:11
 * @Modified By:
 */
@FeignClient(value = "person-service",fallback = UserServiceFallback.class) // 服务提供方应用的名称
public interface UserService {

    @GetMapping("test")
    public  void test();
}
