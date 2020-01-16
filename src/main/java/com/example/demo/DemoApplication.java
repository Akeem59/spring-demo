package com.example.demo;

import com.example.demo.components.ExempleComponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		ExempleComponent comp = (ExempleComponent) ctx.getBean("exempleComponent");
		comp.bonjour();

	}

}
