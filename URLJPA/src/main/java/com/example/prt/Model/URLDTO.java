package com.example.prt.Model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class URLDTO {

	private String originalurl;
	private String name;
	public URLDTO(String originalurl, String name) {
		super();
		this.originalurl = originalurl;
		this.name = name;
	}
	public URLDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOriginalurl() {
		return originalurl;
	}
	public void setOriginalurl(String originalurl) {
		this.originalurl = originalurl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
