package bankmanagement;

//import java.time.LocalDate;
import java.util.Scanner;
import static bankmanagement.BankValidationRules.*;

public class TesterBank implements BankValidationRules {

	public static void main(String[] args) throws InvalidInputException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccNo, name, accType, Amount, Date(eg: 2000-01-01)");
		BankAccount b1 = validateAll(sc.next(),sc.next(),sc.next(),sc.nextLong(),sc.next());
		
		System.out.print("BankDetails: ");
		System.out.println(b1);
	}

}
