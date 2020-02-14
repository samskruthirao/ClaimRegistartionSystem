package com.cg.service;

public class UserroleDto {
	private String username;
	private String password;
	private String rolecode;
	
	public UserroleDto(String username, String password, String rolecode) {
		super();
		this.username = username;
		this.password = password;
		this.rolecode = rolecode;
	}
	

	public UserroleDto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public UserroleDto() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRolecode() {
		return rolecode;
	}

	public void setRolecode(String rolecode) {
		this.rolecode = rolecode;
	}

	@Override
	public String toString() {
		return "UserroleDto [username=" + username + ", password=" + password + ", rolecode=" + rolecode + "]";
	}
	
	
	
}
