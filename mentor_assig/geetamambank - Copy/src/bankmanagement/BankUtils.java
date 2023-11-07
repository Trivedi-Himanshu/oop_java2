package bankmanagement;

import static bankmanagement.BankUtils.signIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public interface BankUtils {
	
	static List<BankAccount> populatedList() {
		List<BankAccount> list = new ArrayList<>(
				Arrays.asList(new BankAccount("1234567", "Himanshu", "Saving", 2000, "2023-02-01", "h@gmail.com", "pass1"),
						new BankAccount("12345671", "Tilak", "Saving", 2100, "2023-12-02", "t@gmail.com", "pass2"),
						new BankAccount("12345672", "Tushar", "Current", 12000, "2022-11-03", "tu@gmail.com", "pass3"),
						new BankAccount("12345673", "Pratik", "Saving", 98000, "2022-07-04", "p@gmail.com", "pass4"),
						new BankAccount("12345674", "Amarsingh", "fixed", 2232000, "2023-01-08", "a@gmail.com", "pass5"),
						new BankAccount("12345675", "satyam", "Saving", 2000230, "2023-02-21", "s@gmail.com", "pass6"),
						new BankAccount("12345676", "Shivanshu", "current", 230000, "2023-02-11", "sh@gmail.com", "pass7"),
						new BankAccount("12345677", "Mohit", "Saving", 870200, "2023-04-21", "m@gmail.com", "pass8")
						));
		return list;
	}
	
	static BankAccount signIn(String email, String pswd, ArrayList<BankAccount> list) throws InvalidInputException {
		
		int index = list.indexOf(new BankAccount(email));
		if(index==-1) {
			throw new InvalidInputException("Invalid Email...!");
		}
		BankAccount b = list.get(index);
		if(!(b.getPassword().equals(pswd)))
				throw new InvalidInputException("Wrong password...!");
		return b;
	}
	
	
	//signIn(sc.next(), sc.next(), bankList);
	static void changePswd(String email, String oPswd, String nPswd, ArrayList<BankAccount> list) throws InvalidInputException {
		BankAccount b = signIn(email, oPswd, list);
		b.setPassword(nPswd);
	}
	
	
	//deposit amount
	static void deposit(String email , long amount, ArrayList<BankAccount> list) throws InvalidInputException{
		if(!(list.contains(new BankAccount(email)))) 
			throw new InvalidInputException("Invalid Email...!");
		
		BankAccount b =list.get(list.indexOf(new BankAccount(email)));
		b.setBalance(b.getBalance()+amount);
		System.out.println(amount+ " deposited to "+email+" successfully...!");
		System.out.println("Updated Balance: "+b.getBalance());
	}
	
	
	//withdraw amount withdraw(sc.next() ,sc.next(), sc.nextLong(),bankList);
	static void withdraw(String email, String pswd, long amount, ArrayList<BankAccount> list) throws InvalidInputException {
		signIn(email, pswd, list);
			BankAccount b = list.get(list.indexOf(new BankAccount(email)));
			
			if (b.getBalance()<amount)
				throw new InvalidInputException("Insufficient balance...!");
			b.setBalance(b.getBalance()-amount);
			System.out.println(amount+ " withdraq from "+email+" successfully...!");
			System.out.println("Updated Balance: "+b.getBalance());
	}
	
	
	//transfer
	static void transfer(String email, String pswd, long amount, String temail, ArrayList<BankAccount> list) throws InvalidInputException {
		withdraw(email,pswd,amount,list);
		deposit(temail, amount, list);
	}
}













