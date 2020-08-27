package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MyController {

	@Value("classpath:getIncidentList.json")
	Resource resourceFile;
	
	@GetMapping("/incidents")
	public JsonNode getData() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.readTree(getClass().getClassLoader().getResourceAsStream("getIncidentList.json").getFile());
        
		return objectMapper.readTree(getClass().getClassLoader().getResourceAsStream("getIncidentList.json"));
	}
}
