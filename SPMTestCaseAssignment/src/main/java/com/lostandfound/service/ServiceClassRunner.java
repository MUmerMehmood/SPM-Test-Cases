package com.lostandfound.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClassRunner {
	@Autowired
	private ServiceClass service;
	
	public ServiceClassRunner(ServiceClass servic) {
		this.service = service;
	}
	
	public String getLanguage() {
		return service.getLanguage();
	}

}
