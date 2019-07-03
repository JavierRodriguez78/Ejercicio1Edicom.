package com.geekshubsacademy.demoioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class DemoiocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoiocApplication.class, args);
		AbstractApplicationContext ctx =
				new AnnotationConfigApplicationContext(DemoiocApplication.class);
	
		HelloService saludo = ctx.getBean("saludaService", HelloService.class);
		HelloService saludo1 = ctx.getBean("saludaService", HelloService.class);
		System.out.println(saludo);
		System.out.println(saludo1);
		ctx.close();
	}
	

}
