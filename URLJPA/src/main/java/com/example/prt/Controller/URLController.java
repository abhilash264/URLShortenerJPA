package com.example.prt.Controller;

import java.io.IOException;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prt.Model.URLDTO;
import com.example.prt.Service.URLServiceImpl;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/create")
public class URLController {

	@Autowired
	URLServiceImpl usi;
	
	@PostMapping("/url")
	public String getshortURL(@RequestBody URLDTO ud)
	{
		return usi.generateURL(ud);
	}
 
	@GetMapping("/get/{encodedurl}")
	public void getOriginal(@PathVariable String encodedurl,HttpServletResponse response) throws IOException
	{
		String originalUrl=usi.retrieveURL(encodedurl);
		response.sendRedirect(originalUrl);
	}
	
}
