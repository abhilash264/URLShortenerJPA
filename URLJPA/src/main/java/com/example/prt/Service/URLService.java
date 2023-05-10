package com.example.prt.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.prt.Model.URLDTO;

@Service
@Component
public interface URLService {

	String generateURL(URLDTO urd);
	String retrieveURL(String encodedurl);
}
