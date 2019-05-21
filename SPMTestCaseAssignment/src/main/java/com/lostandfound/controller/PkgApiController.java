package com.lostandfound.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PkgApiController{
    
	@GetMapping("/")
    public String list(){
        return "pkglist";
    }
	
	@GetMapping("/api/build")
    public String apiBuild(String build){
		
		build = "successful";
        if (build == "successful")
        {
        	return build;
        }
        else
		return "unsucessful";
    }
}