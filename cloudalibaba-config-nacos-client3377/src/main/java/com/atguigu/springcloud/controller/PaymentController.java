package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2021-01-31-20:40
 */
@RestController
@RefreshScope//nacos动态刷新
public class PaymentController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getPayment(){
        return configInfo;
    }
}
