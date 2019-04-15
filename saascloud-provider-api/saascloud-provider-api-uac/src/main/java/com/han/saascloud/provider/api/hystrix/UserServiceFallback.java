package com.han.saascloud.provider.api.hystrix;

import com.han.saascloud.provider.api.service.UserService;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2019/4/3 11:10
 * @Modified By:
 */
public class UserServiceFallback implements UserService {
    @Override
    public void test() {
        System.out.println("服务熔断了");
    }
}
