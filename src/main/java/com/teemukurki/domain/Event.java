package com.teemukurki.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Event {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String title;
	private String date;
	private String desc;
	private String name;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "username")
	private User username;
	
	public Event() {
		super();
	}
	public Event(String title, String date, String desc, String name, User username) {
		super();
		this.title = title;
		this.date = date;
		this.desc = desc;
		this.name = name;
		this.username = username;
	}
	public long getId(){
		return id;
	}
	public void setId(long id){
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public User getUsername(){
		return username;
	}

	public void setUsername(){
		this.username = username;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		this.name = name;
	}
	
	
}
