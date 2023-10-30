package com.code;

import java.time.LocalDate;

public class Customer {
	private int id = count++;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan Plan; 
	private static int count;
	
	static {
		count = 1000;
	}
	
	public Customer(String fname, String lname, String email, String password, double registrationAmount, String dob,
			ServicePlan plan) {
		super();
		this.id = ++count;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = LocalDate.parse(dob);
		Plan = plan;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + 
				", registrationAmount=" + registrationAmount + ", dob=" + dob + ", Plan=" + Plan + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer)
			return this.email.equals(((Customer)obj).email);
		return false;
			
	}
	
	
}
