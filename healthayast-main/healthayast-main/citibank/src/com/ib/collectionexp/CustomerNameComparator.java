package com.ib.collectionexp;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<CustomerColExpPojo> {
	
	public int compare(CustomerColExpPojo cus1, CustomerColExpPojo cus2) {
		return cus1.getCusName().compareTo(cus2.getCusName());
	}
	
}