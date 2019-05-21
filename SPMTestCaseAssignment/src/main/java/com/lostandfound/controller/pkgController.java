package com.lostandfound.controller;

import java.util.Optional;

import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lostandfound.service.PkgService;

@RestController
@RequestMapping("/package")
public class pkgController {
	
	private String pkgName = "Pkg 1";
	
	@Autowired
	private PkgService service;
	
	@GetMapping("")
	public String findPkgByName(String pName) {
		pName = pkgName;
		if (pName == "Pkg1") {
			return pName;
		}
		else
			return "try again";
	}
	
//    @PostMapping
//    public ResponseEntity create(@RequestBody Package pkg) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(pkg));
//    }
//    
//    @DeleteMapping("/id")
//    public ResponseEntity delete(@PathVariable Long id) {
//        service.deleteById(id);
//
//        return ResponseEntity.accepted().build();
//    }
}
