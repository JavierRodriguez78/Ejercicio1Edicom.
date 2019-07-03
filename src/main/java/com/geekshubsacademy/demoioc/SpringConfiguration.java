package com.geekshubsacademy.demoioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfiguration {
	
	@Bean
	public HelloService saludaService(){
		return new HelloServiceImpl();
		
	}

}
