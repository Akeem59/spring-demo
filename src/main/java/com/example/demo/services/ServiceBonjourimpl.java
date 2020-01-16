package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceBonjourimpl implements ServiceBonjour {

    @Override
    public String bonjour() {
        return "Salut Tertous !";
    }
}