package net.antra;

public class Employee{

	int empId=45;
	
	static {
		System.out.println("in employee static");
	}
	
	public void m1() {
		
		System.out.println("in m1 method");
	}

	public native void m2(); 
}
