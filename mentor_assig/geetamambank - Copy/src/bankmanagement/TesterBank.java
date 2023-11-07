package bankmanagement;

import java.util.ArrayList;
//import java.time.LocalDate;
import java.util.Scanner;
import static bankmanagement.BankValidationRules.*;
import static bankmanagement.BankUtils.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TesterBank implements BankValidationRules{

	public static void main(String[] args) throws InvalidInputException{
		try(Scanner sc = new Scanner(System.in)){
			
			//populating the arrayList of BankCustomers
			ArrayList<BankAccount> bankList = new ArrayList<>(populatedList());
			
			
//			loop for switch case and operations
			boolean exit = false;
			while(!exit) {
				
				System.out.println("---------------------------------------");
				System.out.println("1. Sign up\t2. Sign in\t3. Change password\t4. All Students details\t5. Sort(by email)\t6. Sorting(by acctOpenDate)"
						+ "\t7. Unsubsribe\t0.exit\t8. Sort(by acctDatenName)\t9. Deposit\t10. Withdraw\t11. Transfer");
				System.out.println("Enter your choice: ");
				switch(sc.nextInt()) {
				case 1:
					//sign up
					System.out.println("Enter: acctNo, name, accType, bal, accOpeningDate(eg. 2023-01-01), email, pwsd");
					bankList.add(validateAll(sc.next(), sc.next(), sc.next(), sc.nextLong(), sc.next(), sc.next(), sc.next()));
					System.out.println("Successfully sign up...!");
					break;
				case 2:
					// sign in
					System.out.println("Enter the email and password: ");
					signIn(sc.next(), sc.next(), bankList);
					System.out.println("Successfully sign in...!");
					break;
				case 3:
					//change pswd
					System.out.println("Enter the email, password and new password: ");
					changePswd(sc.next(), sc.next(), sc.next(), bankList);
					System.out.println("Password changed successfully...!");
						
					break;
				case 4:
					//all student details (Using iterator)
					Iterator<BankAccount> itr = bankList.iterator();
					while(itr.hasNext())
						System.out.println(itr.next());
					break;
				case 5:
					//sort (By email)
					System.out.println("Sorting as per Email...!");
					Collections.sort(bankList);
					bankList.forEach(System.out::println);
					break;
				case 6:
					//sort(by acctOpenDate)
					//Collections.sort(bankList, new Comparator<BankAccount>() {

						//@Override
						//public int compare(BankAccount o1, BankAccount o2) {
							
							//return o1.getAccOpeningDate().compareTo(o2.getAccOpeningDate());
						//}
						
					//});
					
					System.out.println("Sorting as per Account Opening Date...!");
					Collections.sort(bankList, new SortByAcctDate());
					bankList.forEach(s -> System.out.println(s));
					
					break;
				case 7:
					//unsubscribe
					System.out.print("To remove account, Enter the email: ");
					if(bankList.remove(new BankAccount(sc.next())))
						System.out.println("Account successfully removed...!");
					else 
						throw new InvalidInputException("Email doesn't exists...!");
					break;
				case 8:
					//sorting by acctDate and name
					System.out.println("Sorting( by AcctDate and name).....");
					Collections.sort(bankList, new Comparator<BankAccount>() {
						@Override
						public int compare(BankAccount b1, BankAccount b2) {
							int ret = b1.getAccOpeningDate().compareTo(b2.getAccOpeningDate());
							if(ret == 0) {
								return b1.getName().compareTo(b2.getName());
							}
							return ret;
						}
					});
					bankList.forEach(s->System.out.println(s));
					break;
					
				case 9:
					//deposit
					System.out.print("Enter email and Amount: ");
					deposit(sc.next() ,sc.nextLong(), bankList);
					break;
				case 10:
					//withdraw
					System.out.print("Enter email , pswd and Amount: ");
					withdraw(sc.next() ,sc.next(), sc.nextLong(),bankList);
					break;
				case 11:
					//transfer
					System.out.print("Enter your email, password,amount and the email of receiver ");
					transfer( sc.next(), sc.next(), sc.nextLong(), sc.next(), bankList);
					break;
				case 0:
					//exit
					System.out.println("Exit...!");
					exit=true;
					break;
				default:
					System.out.println("Invalid choice...!");
					break;
				}
			}
			
		}
			
	}

}
