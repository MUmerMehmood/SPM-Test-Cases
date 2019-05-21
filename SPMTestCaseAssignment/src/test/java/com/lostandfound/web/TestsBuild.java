package com.lostandfound.web;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;


import com.lostandfound.service.ServiceClass;

@Profile("test")
@Configuration
public class TestsBuild {
	@Bean
	@Primary
	public ServiceClass service() {
		return Mockito.mock(ServiceClass.class);
	}

}