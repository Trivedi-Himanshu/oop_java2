package bankmanagement;
import java.time.LocalDate;
import java.util.Comparator;

public class BankAccount implements Comparable<BankAccount>{
	private String accNo;
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AcType getAccType() {
		return accType;
	}

	public void setAccType(AcType accType) {
		this.accType = accType;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public LocalDate getAccOpeningDate() {
		return accOpeningDate;
	}

	public void setAccOpeningDate(LocalDate accOpeningDate) {
		this.accOpeningDate = accOpeningDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String name;
	private AcType accType;
	private long balance;
	private LocalDate accOpeningDate;
	private String email;
	private String password;
	
	public BankAccount(String accNo, String name, String accType, long bal, String accOpeningDate,String email, String pswd) {
		this.accNo = accNo;
		this.name = name;
		this.accType = AcType.valueOf(accType.toUpperCase());
		this.balance = bal;
		this.accOpeningDate = LocalDate.parse(accOpeningDate);
		this.email = email;
		this.password = pswd;
	}
	
	
	
	public BankAccount(String email ) {
		this.email = email;
	}

	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BankAccount)
			return email.equals(((BankAccount) obj).email);;
		return false;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", name=" + name + ", accType=" + accType + ", balance=" + balance
				+ ", accOpeningDate=" + accOpeningDate + ", email=" + email + ", password=" + password + "]";
	}

	@Override
	public int compareTo(BankAccount o) {
		return this.getEmail().compareTo(o.getEmail());
	}
	
	
}
