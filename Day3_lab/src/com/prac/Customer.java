package com.prac;
import java.time.LocalDate;

public class Customer implements Comparable<Customer>{
	private int customerId;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private  static int count;
	
	static {
		count=0;
	}
	
	public Customer(String fname, String lname, String email,String password, 
			double registrationAmount, LocalDate dob, ServicePlan plan){
		this.customerId = ++count;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
	}
	
	public Customer(String email){
		super();
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Customer: "+customerId+"\t"+fname+"\t"+lname+
				"\t"+email+"\t"+registrationAmount+
				"\t"+dob+"\t"+plan;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer)
			return (this.email.equals(((Customer)obj).email));
		return false;
		
	}

	
//	getters and setters 
	public int getCustomerId() {
		return customerId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	@Override
	public int compareTo(Customer o) {
		
		return this.email.compareTo(o.email);
	}
}
