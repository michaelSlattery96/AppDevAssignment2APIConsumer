package com.assignment2.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.assignment2.domain.Project;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class ProjectController {

	@GetMapping("showprojects")
	public String showAllProjects(Model model) {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<Project>> responseEntity = restTemplate
				.exchange("http://localhost:8080/projects", HttpMethod.GET, null, new ParameterizedTypeReference<List<Project>>(){});
		
		List<Project> projects = responseEntity.getBody();
		
		model.addAttribute("project", projects);
		
		return "projects";
	}
}
