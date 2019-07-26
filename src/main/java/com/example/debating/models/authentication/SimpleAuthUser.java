package com.example.debating.models.authentication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@ Entity
@ Table(name = "simple_auth_user")
public class SimpleAuthUser  extends AuthUser  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ Column(name = "password", length = 40, nullable = false)
	private String password;

	@ Column(name = "uuid", length = 36, nullable = false)
	private String uuid;

	public String getPassword() {
		return password;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
