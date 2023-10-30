package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Customer;
import com.app.core.ServicePlan;

public class CMSUtils {
//add a static method to populate customer list
	public static List<Customer> populateCustomerList() {
		/*
		 * String firstName, String lastName, String email, String password, double
		 * regAmount, LocalDate dob, ServicePlan plan
		 */
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Rama", "Kadam", "rama@gmail.com", "rama#123", 2000, LocalDate.parse("1990-01-01"),
				ServicePlan.GOLD));
		customers.add(new Customer("Kiran", "Khare", "kiran@gmail.com", "kiran#123", 1000, LocalDate.parse("1995-01-01"),
				ServicePlan.SILVER));
		customers.add(new Customer("Mihir", "Mujumdar", "mihir@gmail.com", "mih#123", 2000, LocalDate.parse("1993-11-21"),
				ServicePlan.GOLD));
		customers.add(new Customer("Rakesh", "Malik", "rakesh@gmail.com", "rak#123", 2000, LocalDate.parse("1994-09-21"),
				ServicePlan.GOLD));
		customers.add(new Customer("Riya", "Pathak", "riya@gmail.com", "riy#123", 5000, LocalDate.parse("1996-12-31"),
				ServicePlan.DIAMOND));
		return customers;
	}
}
