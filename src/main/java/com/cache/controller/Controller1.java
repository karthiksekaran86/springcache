package com.cache.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableCaching
@RequestMapping("/api")
public class Controller1 {
	
	@Autowired
	CacheClass cacheClass;
	
	@GetMapping("/getmap")
	public Map<String,String> getMapMethod(){
		
		Map<String,String> mapObj = new HashMap<>();
		
		mapObj.put("KEY1", "VALUE1");
		mapObj.put("KEY2", "VALUE2");
		System.out.println(cacheClass.method1(mapObj).toString());
		return mapObj;
	}
	
	@PostMapping("/postmap/{id}")
	public String postMapMethod(@PathVariable(value = "id") String abc){
		
		System.out.println("ID==> " + abc);
		System.out.println(cacheClass.method2());
		return "ID==> " + abc;
	}
	

}
