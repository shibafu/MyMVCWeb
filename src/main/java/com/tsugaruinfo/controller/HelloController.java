package com.tsugaruinfo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
public class HelloController {

	private int id;
	
	private List<String> names = new ArrayList<String>();
	private List<String> mails = new ArrayList<String>();
	
	public HelloController() {
		super();
		names.add("taro");
		names.add("hanako");
		names.add("sachiko");
		names.add("tuyano");
		names.add("mami");
		mails.add("taro@yamada");
		mails.add("hanako@flower");
		mails.add("sachiko@happy");
		mails.add("syoda@tuyano.com");
		mails.add("mami@mumemo");
	}
	
	@RequestMapping("/hello")
	public XmlData index(){

		id = ++id >= names.size() ? 0 : id;
		XmlData obj = new XmlData(id, names.get(id), mails.get(id));
		
//		int total = 0;
//		for(int i = 0; i<=num ; i++) {
//			total += i;
//		}
		
		return obj;
	}
}
