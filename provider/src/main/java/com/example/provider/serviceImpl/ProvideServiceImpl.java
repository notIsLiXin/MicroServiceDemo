package com.example.provider.serviceImpl;

import com.example.provider.service.ProviderService;
import org.springframework.stereotype.Service;

@Service
public class ProvideServiceImpl implements ProviderService {
    @Override
    public String sayHello2Consumer(String s) {
        System.out.println("provider s : " + s);
        return s;
    }
}
