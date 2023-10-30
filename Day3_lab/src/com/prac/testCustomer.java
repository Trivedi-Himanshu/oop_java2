//package com.prac;
//import java.time.LocalDate;
//import java.time.format.DateTimeParseException;
//import java.util.Scanner;
//import static com.prac.CustomerDetailValidations.validateAllInputs;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class testCustomer {
//	public static void main(String[] args){
////		Customer cust =null;
//		
//		try(Scanner sc = new Scanner(System.in)){
//			List<Customer> customers = new ArrayList<>();
//			boolean exit = false;
//			while(!exit) {
//				System.out.println("1. Sign up\n2. Sign in\n3. Display\n4. exit");
//				System.out.println("Enter your choice: ");
//				try{
//					
//					System.out.println("Enter: First Name,  Last Name, email, password, registrationAmount, dob(yyyy-MM-dd), plan");
//					Customer cust = validateAllInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
//					System.out.println("customer: "+cust);
//				}catch(InvalidInputException e) {
//					System.out.println(e);
//				}catch(IllegalArgumentException e) {
//					System.out.println(e);
//					System.out.println("Available Plans: ");
//					for (ServicePlan v: ServicePlan.values()) {
//						System.out.println(v);
//					}
//					
//				}catch(DateTimeParseException e) {
//					System.out.println("Enter date in correct format: eg(2001-01-01)");
//				}
//				
//				System.out.println("End of main()....");
//				}
//			}
//	}
//}
//
