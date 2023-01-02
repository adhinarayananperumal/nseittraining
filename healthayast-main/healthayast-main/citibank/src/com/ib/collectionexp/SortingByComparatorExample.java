package com.ib.collectionexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingByComparatorExample {

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
		
		
		List<CustomerColExpPojo> cusList = new ArrayList();
		cusList.add(obj1);
		cusList.add(obj2);
		cusList.add(obj3);

		Collections.sort(cusList, new CustomerNameComparator());
		
		for (CustomerColExpPojo customer : cusList) {
			System.out.println( customer.getCusName() + " ....age is..... "+ customer.getAge());
		}
		
	}

}
