package com.han.saascloud;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2019/4/2 14:52
 * @Modified By:
 */
@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SaasCloudProviderUacApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaasCloudProviderUacApplication.class);
    }

}
