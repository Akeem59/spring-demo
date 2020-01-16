package com.example.demo;

import com.example.demo.components.InjectionAvecSetterComponent;
import com.example.demo.components.InjectionParConstructeurComponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		

		InjectionParConstructeurComponent comp = ctx.getBean(InjectionParConstructeurComponent.class);
		System.out.println(comp.direBonjour());
		InjectionAvecSetterComponent comp2 = ctx.getBean(InjectionAvecSetterComponent.class);
		System.out.println(comp2.direBonjour());
	}

}
