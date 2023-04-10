package com.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Response {
	
	private String Description;
	private String Category;
	private String API;
	private String Auth;
	private Boolean HTTPS;
	private String Cors;
	private String Link;
//	String API;
	
	
	
	

}
