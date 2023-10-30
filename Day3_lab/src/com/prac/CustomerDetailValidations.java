package com.prac;

import java.time.LocalDate;
import java.util.List;

//import com.prac.ServicePlan;

public class CustomerDetailValidations {
	
//	add validation of plan 
	public static ServicePlan validatePlan(String plan) throws InvalidInputException{
			return ServicePlan.valueOf(plan.toUpperCase());
		}
	
//	add validation of registration amount with the plan
	public static void validatePlanAmount(String plan, double regAmount) throws InvalidInputException{
		if(ServicePlan.valueOf(plan).getPlanAmount() != regAmount)
			throw new InvalidInputException("Registration Amount doesn't match...!");
	}
	
//	add date validation rule 
	public static LocalDate validateDate(String date) throws InvalidInputException{
		LocalDate dob = LocalDate.parse(date);
		return dob;
	}
	
	
	
	//##########################################################
	
//	public static void customerReg(String email, String pswd) {
//		System.out.println("Enter: First Name, Last Name, Email, Password, RegistrationAmount, DOB, plan");
//		
//		
//		
//	}
//	
	public static void validateSignIn(String email, String pswd, List<Customer> customers) throws InvalidInputException{
		System.out.println("into the signIn");
		int index = customers.indexOf(new Customer(email));

		if (index==-1)
			throw new InvalidInputException("Email not found try again...!");
		Customer cust = customers.get(index);
		if(cust.getPassword().equals(pswd))
			System.out.println("Successfully signed in...!");
		else 
			throw new InvalidInputException("Wrong password...!");
	}
	
	public static void changePswd(String email, String pswd, String nPswd, List<Customer> customers) throws InvalidInputException{
		int index = customers.indexOf(new Customer(email)); 
		if (index==-1)
			throw new InvalidInputException("Invalid email...!");
		Customer cust = customers.get(index);
		if(cust.getPassword().equals(pswd))
			cust.setPassword(nPswd);
		else
			throw new InvalidInputException("Wrong password...!");
		System.out.println("Password changed successfully...!");
	}
		
	public static void removeCust(String email, List<Customer> customers) throws InvalidInputException {
		int index = customers.indexOf(new Customer(email));
		if (index==-1)
			throw new InvalidInputException("Cannot be removed, invalid email...!");
		customers.remove(index);
		System.out.println("Successfully removed...!");
	}
	//##########################################################
		
//	email validation 
//	"[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)"
//	String:pubic boolean matches 
//	no dups
	
	
//	String regex = "^(.+)@(.+)$";
//
//	Pattern pattern = Pattern.compile(regex);
//
//	for(String email : emails){
//		Matcher matcher = pattern.matcher(email);
//		System.out.println(email +" : "+ matcher.matches());
//	}
	
	
	public static void validateEmail(String email, List<Customer> customers) throws InvalidInputException{
		String pattern = "[a-z]+[a-z0-9]+@\\.(@gmail.com)";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(email);
		
		if (!email.matches(pattern))  
			throw new InvalidInputException("email invalid...!");
		// -> valid email, now chk for dups
		// wrap PK (email) in customer
		
		Customer c = new Customer(email);
		if(customers.contains(c))
			throw new InvalidInputException("Dup email...!");
	}
	
//	all validation rule 
	public static Customer validateAllInputs(String fname, String lname, String email,String password, 
			double registrationAmount, String dob, String plan, List<Customer> customers) throws InvalidInputException{
		ServicePlan validPlan = validatePlan(plan);
		validatePlanAmount(plan, registrationAmount);
		validateEmail(email, customers);
		LocalDate validDob = validateDate(dob);
		
		return new Customer( fname,  lname,  email, password, registrationAmount, validDob,  validPlan);
	}

	
	
}
