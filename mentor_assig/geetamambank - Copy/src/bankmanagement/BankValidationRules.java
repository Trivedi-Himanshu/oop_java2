package bankmanagement;

import java.time.LocalDate;

public interface BankValidationRules {
	
	//AccOpeningDate must be in after 1st Jan 2000
	static boolean validateOpeningDate(String date) throws InvalidInputException{
		LocalDate d1 = LocalDate.parse(date);
		
//		if(!((LocalDate.parse(date)).isAfter(LocalDate.parse("2000-01-01"))))
		if(d1.isBefore(LocalDate.parse("2000-01-01")))
			 throw new InvalidInputException("Acct opened after 01-01-2000...!");
		return true;
	}
	
	//AccType must be valid
	static boolean validateAcctType(String acctType) throws InvalidInputException{
		if(!((AcType.valueOf(acctType.toUpperCase()).toString()).equals(acctType.toUpperCase())))
			throw new InvalidInputException("Acct Type is not Valid...!");
		return true;
	}
	
	//validate all
	static BankAccount validateAll(String acctNo, String name, String accType, long bal, String accOpeningDate, String email, String pwsd) throws InvalidInputException{
		validateAcctType(accType);
		validateOpeningDate(accOpeningDate);
		return new BankAccount(acctNo, name, accType, bal, accOpeningDate, email,pwsd );
	}
}
