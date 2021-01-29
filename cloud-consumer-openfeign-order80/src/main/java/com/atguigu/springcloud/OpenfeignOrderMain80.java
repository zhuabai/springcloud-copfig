package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shkstart
 * @create 2021-01-26-14:39
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class OpenfeignOrderMain80 {
      public static void main(String[] args) {
              SpringApplication.run(OpenfeignOrderMain80.class,args);
          }
}
