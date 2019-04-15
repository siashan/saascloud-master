package com.han.saascloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2019/4/1 16:16
 * @Modified By:
 */
@EnableEurekaServer
@SpringBootApplication
public class SaasCloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaasCloudEurekaApplication.class);
    }
}
