package com.ib.collectionexp;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> productNameList = new ArrayList();
		
		productNameList.add("mobile");
		productNameList.add("laptop");
		productNameList.add("laptop");

		
		System.out.println("Total no of product is : " + productNameList.size());
		
		productNameList.add("mobile charger");
		System.out.println("Total no of product is : " + productNameList.size());
		
		System.out.println(productNameList.contains("radio"));
		
		for(String pn:productNameList) {
			System.out.println(pn);
		}
		
		productNameList.add("radio");
		
		System.out.println(productNameList.contains("radio"));
		
		//productNameList.remove("mobile");

		
		System.out.println(productNameList.size());
		
		System.out.println(productNameList.get(1));		
	}
}
