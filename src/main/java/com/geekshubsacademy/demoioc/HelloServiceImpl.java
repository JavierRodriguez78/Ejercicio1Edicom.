package com.geekshubsacademy.demoioc;

import org.springframework.stereotype.Service;


@Service("HelloService")
public class HelloServiceImpl implements HelloService {
   
	@Override
	public void saludar() {
		System.out.println("\n --Bienvenido a Spring -- \n");
		
	}
	

}
