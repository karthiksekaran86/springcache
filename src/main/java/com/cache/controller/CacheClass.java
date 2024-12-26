package com.cache.controller;

import java.util.Map;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@CacheConfig(cacheNames="cache1")
@Component
public class CacheClass {

	@Cacheable(value="mapCache")  
	public Map<String,String> method1(Map<String,String> mapObj)  
	{  
		System.out.println("In cache method");
		Map<String,String> cacheMap = mapObj;
		return cacheMap;  
	}
	
	@CacheEvict(value="mapCache", allEntries=true)  
	public String method2()   
	{  
		System.out.println("Cache is cleared");
		return "CacheCleared";
	}  
	
}
