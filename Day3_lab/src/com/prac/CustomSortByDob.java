package com.prac;

import java.util.Comparator;

public class CustomSortByDob implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getDob().compareTo(o2.getDob());
	}

}
