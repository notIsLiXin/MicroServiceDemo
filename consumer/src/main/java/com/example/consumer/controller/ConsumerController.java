package com.example.consumer.controller;

import com.example.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("/hello")
    public void sayHello(){
        String str = providerService.sayHello2Consumer("Not hello, just hi. ");
        System.out.println("consumer get str = " + str + " from provide");
    }
}