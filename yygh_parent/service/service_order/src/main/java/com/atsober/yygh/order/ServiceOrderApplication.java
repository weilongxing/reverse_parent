package com.atsober.yygh.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author shkstart
 * @create 2022-05-20 20:57
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.atsober")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.atsober")
public class ServiceOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceOrderApplication.class, args);
    }
}
