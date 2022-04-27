package com.training.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dummy_User")
public class User {
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@Column(name = "user_name")
	private String username;
	
	private String password;
	
	public User() {
		
	}
	
	public User(String username,String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
}
