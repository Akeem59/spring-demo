package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.components.InjectionAvecSetterComponent;
import com.example.demo.components.InjectionDirecteComponent;
import com.example.demo.components.InjectionParConstructeurComponent;
import com.example.demo.services.ServiceBonjourimpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	public void testInjectionDirecte() {
		InjectionDirecteComponent comp = new InjectionDirecteComponent();
		comp.serviceBonjour = new ServiceBonjourimpl();
		assertEquals("Salut Tertous !", comp.direBonjour());
	}

	@Test
	public void testInjectionAvecSetter() {
		InjectionAvecSetterComponent comp = new InjectionAvecSetterComponent();
		comp.setServiceBonjour(new ServiceBonjourimpl());
		assertEquals(" Salut Tertous !", comp.direBonjour());
	}

	@Test
	public void testInjectionParConstructeur(){
		InjectionParConstructeurComponent comp = 
			new InjectionParConstructeurComponent(new ServiceBonjourimpl());

			assertEquals("Salut Tertous !", comp.direBonjour());
	}
}
