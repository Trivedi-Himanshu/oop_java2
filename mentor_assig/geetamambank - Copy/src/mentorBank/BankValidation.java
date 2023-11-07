package mentorBank;

import java.time.LocalDate;

public class BankValidation {
	public static boolean isValidAccount(String accNo, String name, AccType accType, long balance, LocalDate accOpeningDate) {
	    // Check if AccOpeningDate is after 1st Jan 2000
	    LocalDate minDate = LocalDate.of(2000, 1, 1);
	    if (accOpeningDate.isBefore(minDate)) {
	        System.out.println("Invalid Account Opening Date. It must be after 1st Jan 2000.");
	        return false;
	    }

	    // Check if AccType is valid
	    boolean validAccType = false;
	    for (AccType type : AccType.values()) {
	        if (type == accType) {
	            validAccType = true;
	            break;
	        }
	    }
	    if (!validAccType) {
	        System.out.println("Invalid Account Type.");
	        return false;
	    }

	    return true; // If both validation rules are satisfied
	}
}
