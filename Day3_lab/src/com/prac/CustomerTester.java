package com.prac;

import java.util.Scanner;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import static com.prac.CustomerDetailValidations.*;
import java.util.Collections;
import java.util.Comparator;

public class CustomerTester {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
				List<Customer> customers = new ArrayList<>();
				boolean exit = false;
			
	 		//start of while loop for the options and there actions 
			while(!exit) {
				System.out.println("1. Sign up\n2. Sign in\n3. Change Password\n4. Unsubscribe customer \n5. Display all customers\n6. Sort customers as per email \n7. Sort customer as per DOB \n8. Sort customer as per DOB and Last Name \n0. Exit");
				System.out.println("Enter your choice: ");
				
				try{
					switch(sc.nextInt()) {
					case 1: 
						System.out.println("sign up...");
						System.out.println("Enter  fname, lname, email, password, registrationAmount, dob, plan");
						customers.add(validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), customers));
						break;
					case 2:
						System.out.println("sign in...");
						System.out.println("Enter the email and pswd: ");
						validateSignIn(sc.next(), sc.next(), customers); 
						break;
					case 3:
						System.out.println("change password...");
						System.out.println("Enter email, password and new_password");
						changePswd(sc.next(),sc.next(),sc.next(), customers);
						break;
					case 4:
						System.out.println("remove customer...");
						System.out.println("enter email");
						removeCust(sc.next(), customers);
						break;
					case 5:
						for(Customer c: customers)
							System.out.println(c);
						break;
					case 6: 
					//Sort customer details as per email , using Natural Ordering
						System.out.println("sort by email...");
						Collections.sort(customers);
						break;
					case 7: 
					//2.2 Sort customer details as per date of birth , using custom ordering
						System.out.println("Custom sort by DOB... ");
						Collections.sort(customers, new CustomSortByDob());
						break;
					case 8: 
					//Sort customer details as per date of birth n last name , using custom ordering n anonymous inner class
						System.out.println("sort by dob and last name using functional interface");
						Collections.sort(customers, new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {
								int ret = o1.getDob().compareTo(o2.getDob());
									if (ret==0) {
										return o1.getLname().compareTo(o2.getLname());
									}	
								return ret;
							}
							
						});
						break;
					case 0:
						exit = true;
						System.out.println("Exit");
						break;
					}
				}catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
				}
			}
		}
	}
}
