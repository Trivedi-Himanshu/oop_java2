package mentorBank;

import java.time.LocalDate;

public class Bank {
	private String AccNo;
    private String name;
    private long balance;
    private AccType act; 
    private LocalDate AccOpeningDate;
	
    
	public Bank(String accNo, String name, AccType accType, long balance, AccType act, LocalDate accOpeningDate) {
		super();
		AccNo = accNo;
		this.name = name;
		this.act = accType;
		this.balance = balance;
		this.act = act;
		AccOpeningDate = accOpeningDate;
	}


	public String getAccNo() {
		return AccNo;
	}

	public void setAccNo(String accNo) {
		AccNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public AccType getAct() {
		return act;
	}

	public void setAct(AccType act) {
		this.act = act;
	}



	public LocalDate getAccOpeningDate() {
		return AccOpeningDate;
	}

	public void setAccOpeningDate(LocalDate accOpeningDate) {
		AccOpeningDate = accOpeningDate;
	}
	
	@Override
	public String toString() {
		return "Bank [AccNo=" + AccNo + ", name=" + name + ", balance=" + balance + ", act=" + act + ", AccOpeningDate="
				+ AccOpeningDate + "]";
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bank bank = (Bank) obj;
        return AccNo.equals(bank.AccNo);
    }
	
}