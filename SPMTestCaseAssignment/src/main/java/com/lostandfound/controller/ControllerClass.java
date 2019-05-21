package com.lostandfound.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lostandfound.bean.LanguageCLass;
import com.lostandfound.bean.LanguageClassDTO;
import com.lostandfound.repo.LanguageRepo;

//import net.javaguides.springboot.springsecurity.web.dto.LanguageDto;

@RestController
@RequestMapping("/main")
public class ControllerClass {
	@Autowired
	private LanguageRepo languagerepo;
	
	public ControllerClass(LanguageRepo languagerepo) {
		this.languagerepo = languagerepo;
	}
	
    @RequestMapping("/check")
    public String homeControllerChecking() {
        return "Controller Class Testing";
    }
    
	@GetMapping("/index")
	public String userIndex() {
		return "Index";
	}

	@GetMapping("/find/user")
	public String findUser(Integer id, String name) {
	id = 01;
	name = "Umer";
		return id + name;
	}
	

//	
//	@GetMapping("/")
//	public List<LanguageCLass> all(){
//		return languagerepo.findAll();
//	}
	

//	
//	
//	@ModelAttribute("/language")
//		public LanguageClassDTO languageDtO() {
//			return new LanguageClassDTO(01, "Arabic", "KSA");
//		}
//	
//	@GetMapping("/service")
//	public String showLanguageForm() {
//		
//		List<LanguageClassDTO> languageList = languageService.findAll();
//		//model.addAttribute("languageList", languageList);
//		return "indexer";
//	}
//	
//	@GetMapping("/test")
//	public String testingIndex(){
//		return "successfully";
//	}

}
