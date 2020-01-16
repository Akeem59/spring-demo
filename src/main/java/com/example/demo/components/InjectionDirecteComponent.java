package com.example.demo.components;

import com.example.demo.services.ServiceBonjour;

public class InjectionDirecteComponent {
    
    public ServiceBonjour serviceBonjour;

    public String direBonjour() {
        return serviceBonjour.bonjour();
    }
}