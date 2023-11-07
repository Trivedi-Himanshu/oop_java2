package bankmanagement;
import java.time.LocalDate;

public class BankAccount {
	private String accNo;
	private String name;
	private AcType accType;
	private long balance;
	private LocalDate accOpeningDate;
	
	public BankAccount(String accNo, String name, String accType, long bal, String accOpeningDate) {
		this.accNo = accNo;
		this.name = name;
		this.accType = AcType.valueOf(accType.toUpperCase());
		this.balance = bal;
		this.accOpeningDate = LocalDate.parse(accOpeningDate);
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", name=" + name + ", accType=" + accType
				+ ", balance=" + balance + ", accOpeningDate=" + accOpeningDate + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BankAccount)
			return accNo.equals(((BankAccount) obj).accNo);;
		return false;
	}
	
	
}
