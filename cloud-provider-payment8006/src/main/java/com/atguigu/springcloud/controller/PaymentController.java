package com.atguigu.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author shkstart
 * @create 2021-01-26-12:32
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul"+serverPort+"\t"+ UUID.randomUUID().toString();
    }

//    @GetMapping("/payment/discovery")
//    public Object discover(){
//        List<String> services = discoveryClient.getServices();
//        for (String element : services) {
//            log.info("********element"+element);
//
//        }
//
//        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
//        for (ServiceInstance serviceInstance : instances) {
//            log.info(serviceInstance.getServiceId()+"\t"+serviceInstance.getHost()+"\t"+serviceInstance.getPort()+"\t"+serviceInstance.getUri());
//
//        }
//        return this.discoveryClient;
//    }
}