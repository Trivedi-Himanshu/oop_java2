package bankmanagement;

import java.util.Comparator;

public class SortByAcctDate implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		return o1.getAccOpeningDate().compareTo(o2.getAccOpeningDate());
	}

	
	
}
