package com.cg.service;

public class AccountDto {
	private Integer accountNumber;
	private String username;
	
	public AccountDto(Integer accountNumber, String username) {
		super();
		this.accountNumber = accountNumber;
		this.username = username;
	}
	public AccountDto() {
		super();
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", username=" + username + "]";
	}
	
	
	
}
