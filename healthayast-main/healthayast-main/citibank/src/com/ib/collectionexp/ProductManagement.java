package com.ib.collectionexp;

import java.util.ArrayList;

public class ProductManagement {
	
	
	void listProduct(ArrayList<String> prodList){

		for(String pn:prodList) {
			System.out.println(pn);
		}
	}
	
	
	

	
	ArrayList<String> getOroductList(){
		ArrayList<String> productNameList = new ArrayList();

		productNameList.add("brush");
		productNameList.add("paste");
		productNameList.add("Shanpoo");
		productNameList.add("brush");

		return productNameList;
	}
	
	

}
