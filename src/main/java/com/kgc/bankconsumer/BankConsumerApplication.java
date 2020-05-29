package com.kgc.bankconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableHystrix//容错处理
public class BankConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankConsumerApplication.class, args);
    }

}
