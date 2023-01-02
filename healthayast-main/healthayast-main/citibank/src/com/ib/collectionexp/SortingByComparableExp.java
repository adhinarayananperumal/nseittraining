package com.ib.collectionexp;

import java.util.TreeSet;

public class SortingByComparableExp {

	public static void main(String[] args) {

		
		
		CustomerColExpPojo obj1 = new CustomerColExpPojo();
		obj1.setCusName("suresh");
		obj1.setAge(23);
		
		CustomerColExpPojo obj2 = new CustomerColExpPojo();
		obj2.setCusName("radha");
		obj2.setAge(41);
		
		CustomerColExpPojo obj3 = new CustomerColExpPojo();
		obj3.setCusName("priya");
		obj3.setAge(18);
		
		TreeSet<CustomerColExpPojo> ts = new TreeSet();
		ts.add(obj1);
		ts.add(obj2);
		ts.add(obj3);
		
		for (CustomerColExpPojo customer : ts) {
			System.out.println( customer.getCusName() + " ....age is..... "+ customer.getAge());
		}
		
		
		
	}

}
