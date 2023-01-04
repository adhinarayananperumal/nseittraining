package com.icici.encapsulationexp;

public class EncpImpl {
	
	public void m1(){
		System.out.println("m1 method");
	}
	
	protected void m2(){
		System.out.println("m2 method");
		m3();
	}
	
	private void m3(){
		System.out.println("m3 method");
	}
	
	void m4(){
		System.out.println("m4 method");
	}
}
