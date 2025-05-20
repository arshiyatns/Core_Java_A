package com.tns.day3;

public class ConstructorEx 
{
	private String customerName;
	private int customerId;
	private String customerCity;
	
//	public ConstructorEx()
//	{
//		System.out.println("iam a default constructor");
//	}
	public ConstructorEx(String customerName, int customerId, String customerCity) {
		
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}
	
	
	//getter and setter
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}


	@Override
	public String toString() {
		return "ConstructorEx [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}
	
	
	

}
