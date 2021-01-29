package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shkstart
 * @create 2021-01-26-18:20
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaMain7001 {
     public static void main(String[] args) {
             SpringApplication.run(EurekaMain7001.class,args);
         }
}
