package com.sathya.java8;

import java.util.Map;

class Customer{
	private String fName;
	private String sName;
	private Integer mobile;
	private String email;
	public Customer(String fName, String sName, Integer mobile, String email) {
		super();
		this.fName = fName;
		this.sName = sName;
		this.mobile = mobile;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [fName=" + fName + ", sName=" + sName + ", mobile=" + mobile + ", email=" + email + "]";
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
public class A_6 {

	public static void main(String[] args) {
		Map<Integer,Customer>details=Map.of(
				1,new Customer("rohith", "akkena",990838531,"rohith@gmail.com"),
				2,new Customer("umaMahesh", "chinchula",990835431,"uma@gmail.com")
				
				);
		details.forEach((s,v)->System.out.println(s+""+v));

	}

}
