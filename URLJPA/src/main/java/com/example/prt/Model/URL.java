package com.example.prt.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="URL")
@Component
public class URL {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String originalurl;
	private String encodedurl;
	private String name;
	public URL() {
		super();
		// TODO Auto-generated constructor stub
	}
	public URL(String originalurl,String encodedurl,String name)
	{
		this.originalurl=originalurl;
		this.encodedurl=encodedurl;
		this.name=name;
	}
	public URL(String originalurl,String name)
	{
		this.originalurl=originalurl;
		this.name=name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOriginalurl() {
		return originalurl;
	}
	public void setOriginalurl(String originalurl) {
		this.originalurl = originalurl;
	}
	public String getEncodedurl() {
		return encodedurl;
	}
	public void setEncodedurl(String encodedurl) {
		this.encodedurl = encodedurl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "URL [id=" + id + ", originalurl=" + originalurl + ", encodedurl=" + encodedurl + ", name=" + name + "]";
	}
	
}
