package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shkstart
 * @create 2021-01-26-14:39
 */
@SpringBootApplication
@EnableFeignClients
//@EnableEurekaClient
@EnableHystrix
public class HystrixFeignOrderMain80 {
      public static void main(String[] args) {
              SpringApplication.run(HystrixFeignOrderMain80.class,args);
          }
}
