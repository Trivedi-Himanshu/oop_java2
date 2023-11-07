package mentorBank;

public enum AccType {
	CURRENT(1000), SAVING(2000), FIXED(10000);
	private double minimumBalance;

	private AccType(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	} 
	
}
