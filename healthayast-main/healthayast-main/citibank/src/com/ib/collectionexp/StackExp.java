package com.ib.collectionexp;

import java.util.Stack;

public class StackExp {
	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();

		// Add elements to Stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");

		for (String ani : animals) {
			System.out.println(ani);
		}


		// without removing the object
		String a = animals.peek();
		System.out.println("\n\n After peek  " + a);

		//  removing the object
		String ap = animals.pop();
		System.out.println("\n\n After pop " + ap);

		for (String ani : animals) {
			System.out.println(ani);
		}
	}
}