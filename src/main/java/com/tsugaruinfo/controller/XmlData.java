package com.tsugaruinfo.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "xmldata")
@XmlAccessorType(XmlAccessType.NONE)
class XmlData {

	@XmlAttribute
	private Integer id;
	
	@XmlElement
	private String name;
	
	@XmlElement
	private String email;

	public XmlData() {
		super();
		this.id = 0;
		this.name = "noname";
		this.email = "no@email";
	}

	public XmlData(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
}