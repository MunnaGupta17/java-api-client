package com.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.api.entity.MyResponse;
import com.google.gson.Gson;

@RestController
public class controller {
	
	@RequestMapping("/getRes")
	public ResponseEntity<MyResponse> getresponse(){
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://api.publicapis.org/entries";
		String jsonResponse = restTemplate.getForObject(url, String.class);

		Gson gson = new Gson();
		MyResponse response = gson.fromJson(jsonResponse, MyResponse.class);
//		MyResponse response = restTemplate.getForObject(url, MyResponse.class);
		return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
	}

}
