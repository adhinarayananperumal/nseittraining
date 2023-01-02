package com.ib.collectionexp;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> productNameList = new ArrayList();

		productNameList.add("Shoe");
		productNameList.add("Shirt");
		productNameList.add("mobile charger");

		ProductManagement productManagement = new ProductManagement();
		//productManagement.listProduct(productNameList);
		
		
		ArrayList<String> prodList= productManagement.getOroductList();
		
		for(String pn:prodList) {
			System.out.println(pn);
		}
		
	}

}
