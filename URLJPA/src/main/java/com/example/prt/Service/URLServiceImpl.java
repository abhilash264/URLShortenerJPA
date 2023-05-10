package com.example.prt.Service;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.prt.Model.URL;
import com.example.prt.Model.URLDTO;
import com.example.prt.Repository.URLRepository;
import com.google.common.hash.Hashing;

@Component
@Service
public class URLServiceImpl implements URLService{
	
	@Autowired
	URL ur;
	
	@Autowired
	URLRepository urs;
	
	@Override
	public String generateURL(URLDTO urd) {
		// TODO Auto-generated method stub
		String originalURL=urd.getOriginalurl();
		String encodeurl="";
		encodeurl=Hashing.murmur3_32().hashString(originalURL, StandardCharsets.UTF_8).toString();
		ur=new URL(originalURL,encodeurl,urd.getName());
		urs.save(ur);
		return encodeurl;
	}

	@Override
	public String retrieveURL(String EncodedURL) {
		return urs.findByEncodedurl(EncodedURL).getOriginalurl();
		
		
	}

}
