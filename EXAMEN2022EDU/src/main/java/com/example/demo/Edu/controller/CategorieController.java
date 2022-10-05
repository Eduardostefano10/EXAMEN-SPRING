package com.example.demo.Edu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Edu.service.CategoriaService;

/*Eduardo*/
@RestController
@RequestMapping("/api/categoria")
public class CategorieController {
	
	@Autowired
	private CategoriaService categorieService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll2(){		
		return categorieService.readAll2();
	}	
	@GetMapping("/all2")
	public List<Map<String, Object>> readAll3(){		
		return categorieService.readAll3();
	}
	

}
