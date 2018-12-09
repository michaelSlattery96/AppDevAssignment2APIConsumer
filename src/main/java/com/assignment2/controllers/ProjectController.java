package com.assignment2.controllers;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
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
	
	HttpHeaders createHeaders(String username, String password)
	{
		return new HttpHeaders() 
		{
			{
				String auth = username + ":" + password;
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("UTF-8")));
				String authHeader = "Basic " + new String( encodedAuth );
				System.out.println("\n\n\n" + authHeader + "\n\n\n");
				set( "Authorization", authHeader );
			}
		};
	}

	@GetMapping("showprojects")
	public String showAllProjects(Model model) {
		
		RestTemplate restTemplate = new RestTemplate();
		String URL = "http://localhost:8080/api/projects";
		String username = "michael.slattery1@mycit.ie";
		String password = "Password";
		
		ResponseEntity<List<Project>> responseEntity = restTemplate
				.exchange(URL, HttpMethod.GET,
						new HttpEntity<Project>(createHeaders(username, password)),
						new ParameterizedTypeReference<List<Project>>(){});
		
		List<Project> projects = responseEntity.getBody();
		
		model.addAttribute("projects", projects);
		
		return "projects";
	}
}
