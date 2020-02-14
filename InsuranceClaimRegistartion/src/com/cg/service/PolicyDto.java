package com.cg.service;

public class PolicyDto {
	private Integer policyNumber;
	private Double policyPremium;
	private Integer accountNumber;
	public PolicyDto(Integer policyNumber, Double policyPremium, Integer accountNumber) {
		super();
		this.policyNumber = policyNumber;
		this.policyPremium = policyPremium;
		this.accountNumber = accountNumber;
	}
	public PolicyDto() {
		super();
	}
	public Integer getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Integer policyNumber) {
		this.policyNumber = policyNumber;
	}
	public Double getPolicyPremium() {
		return policyPremium;
	}
	public void setPolicyPremium(Double policyPremium) {
		this.policyPremium = policyPremium;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "PolicyDto [policyNumber=" + policyNumber + ", policyPremium=" + policyPremium + ", accountNumber="
				+ accountNumber + "]";
	}
	
	
}
