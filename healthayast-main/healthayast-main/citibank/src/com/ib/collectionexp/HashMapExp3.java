package com.ib.collectionexp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExp3 {

	public static void main(String[] args) {

		Map<Integer, String> mapEmp = new HashMap();

		mapEmp.put(101, "ravi");
		mapEmp.put(102, "kumar");
		mapEmp.put(103, "suman");
		mapEmp.put(104, "getha");
		
		mapEmp.put(102, "suresh");
		System.out.println(mapEmp.get(101));

		for (Map.Entry<Integer, String> c : mapEmp.entrySet()) {
			Integer id = c.getKey();
			String name = c.getValue();
			System.out.println("\n" + id);
			System.out.println(name);
		}
	}
}
