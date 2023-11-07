package mentorBank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import static mentorBank.BankValidation.isValidAccount;

public class BankTester {
	
	public static void main(String[] args) {
	    ArrayList<Bank> customers = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);
	
	    while (true) {
	        System.out.println("Bank Management System Menu:");
	        System.out.println("1. Add a Customer");
	        System.out.println("2. Display Customers");
	        System.out.println("3. Exit");
	        System.out.print("Choose an option: ");
	        int choice = scanner.nextInt();
	
	        switch (choice) {
	            case 1:
	                System.out.println("Adding a Customer");
	                // Input customer details
	                System.out.print("Enter Account No: ");
	                String accNo = scanner.next();
	                System.out.print("Enter Name: ");
	                String name = scanner.next();
	                System.out.print("Enter Account Type (SAVING, CURRENT, FIXED): ");
	                AccType accType = AccType.valueOf(scanner.next().toUpperCase());
	                System.out.print("Enter Balance: ");
	                long balance = scanner.nextLong();
	                System.out.print("Enter Account Opening Date (yyyy-mm-dd): ");
	                String dateStr = scanner.next();
	                LocalDate accOpeningDate = LocalDate.parse(dateStr);
	
	                // Validate and add the customer
	                if (isValidAccount(accNo, name, accType, balance, accOpeningDate)) {
	                    Bank bank = new Bank( accNo,  name,  accType,  balance, accType,  accOpeningDate);
	                    customers.add(bank);
	                    System.out.println("Customer added successfully.");
	                }
	                break;
	
	            case 2:
	                System.out.println("Displaying Customers:");
	                for (Bank customer : customers) {
	                    System.out.println(customer);
	                }
	                break;
	
	            case 3:
	                System.out.println("Exiting the program.");
	                scanner.close();
	                System.exit(0);
	                break;
	
	            default:
	                System.out.println("Invalid option. Please choose a valid option.");
	        	}
	    	}
		}
}