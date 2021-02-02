package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author shkstart
 * @create 2021-01-29-18:27
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
     public static void main(String[] args) {
             SpringApplication.run(ConfigCenterMain3344.class,args);
         }
}
