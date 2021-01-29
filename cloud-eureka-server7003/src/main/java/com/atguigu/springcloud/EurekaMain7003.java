package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shkstart
 * @create 2021-01-26-18:30
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaMain7003 {
     public static void main(String[] args) {
             SpringApplication.run(EurekaMain7003.class,args);
         }
}
