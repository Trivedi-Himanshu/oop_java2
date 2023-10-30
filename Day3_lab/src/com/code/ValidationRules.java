package com.code;

import java.time.LocalDate;

public class ValidationRules {
//	add a mehtos to parse n validte service plan
	public static ServicePlan CustomerException(String plan) {
		
		return ServicePlan.valueOf(plan.toUpperCase());
	}
	
//	add a method to validate registration amount with the plan
	public static void validatePlanAmount(ServicePlan plan, double regAmount) throws Exception{
		if(plan.getServiceCharge()!= regAmount)
			throw new CustomerException("Reg amount doesn't match");
	}
	
	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}
	
	
//	add a method to call all validation rules 
	public static Customer validateAllInputs(String fname, String lname, String email, String password, double registrationAmount, String dob,ServicePlan plan) throws InvalidInputException{
		
	}
	
	
	
}
