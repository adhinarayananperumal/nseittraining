package com.ib.collectionexp;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashcodeHashSetExp {

	public static void main(String[] args) {
		CustomerEquHashCodeExpPojo obj1 = new CustomerEquHashCodeExpPojo();
		obj1.setCusId("incedo100");
		obj1.setCusName("suresh");
		obj1.setAge(11);

		CustomerEquHashCodeExpPojo obj2 = new CustomerEquHashCodeExpPojo();
		obj2.setCusId("incedo200");
		obj2.setCusName("radha");
		obj2.setAge(41);

		CustomerEquHashCodeExpPojo obj3 = new CustomerEquHashCodeExpPojo();
		obj3.setCusId("incedo100");
		obj3.setCusName("suresh");
		obj3.setAge(23);

		Set<CustomerEquHashCodeExpPojo> cusList = new HashSet();
		cusList.add(obj1);
		cusList.add(obj2);
		cusList.add(obj3);

		for (CustomerEquHashCodeExpPojo customer : cusList) {
			if(customer!=null) {
				System.out.println(customer.getCusName() + " ....age is..... " + customer.getAge());
			}
		}
	}

}
