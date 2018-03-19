package com.tsugaruinfo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class MyMemoData implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
	@SequenceGenerator(name = "id_seq", sequenceName="mymemodata_id", allocationSize = 1)
	private long id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String content;
	
	public MyMemoData() {
		super();
	}
	
	public MyMemoData(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "MyMemoData [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
}
