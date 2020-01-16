package com.example.demo.components;

import com.example.demo.services.ServiceBonjour;

import org.springframework.stereotype.Component;

@Component
public class InjectionParConstructeurComponent {
    
    private ServiceBonjour serviceBonjour;

    public InjectionParConstructeurComponent(ServiceBonjour serviceBonjour){
        this.serviceBonjour = serviceBonjour;
    }


    public String direBonjour() {
        return serviceBonjour.bonjour();
    }
}