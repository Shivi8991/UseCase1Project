package com.prepare.DemoRest.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String name;
	    private String email;
	    private String role; // USER or ADMIN
	    private String password;
	    private String gender;
	    private String contact;
	    private String address;
	}



