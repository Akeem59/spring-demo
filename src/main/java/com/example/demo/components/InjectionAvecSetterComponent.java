package com.example.demo.components;

import com.example.demo.services.ServiceBonjour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class InjectionAvecSetterComponent {
    
    @Autowired
    private ServiceBonjour serviceBonjour;

    public String direBonjour() {
        return serviceBonjour.bonjour();
    }

    public void setServiceBonjour(ServiceBonjour service){
        serviceBonjour = service;
    }
}