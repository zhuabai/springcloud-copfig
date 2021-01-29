package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shkstart
 * @create 2021-01-28-23:08
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
     public static void main(String[] args) {
             SpringApplication.run(GateWayMain9527.class,args);
         }
}
