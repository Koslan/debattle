package com.example.debating.models.authentication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@ Entity
@ Table(name = "facebook_auth_user")
public class FacebookAuthUser extends AuthUser {
	@ Column(name = "first_name", length = 32)
	private String firstName;

	@ Column(name = "last_name", length = 32)
	private String lastName;

	@ Column(name = "email", length = 64)
	private String email;

	@ Column(name = "token", length = 128)
	private String token;

	//any number of available properties
	//getters/setters
}
