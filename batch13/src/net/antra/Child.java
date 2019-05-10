package net.antra;

public class Child extends Parent{

	int childj=89;
	
	public Child(){
		
		//super(10);
		this(10);
		super.i=56;
	}
	
	public Child(int k) {
		//super(10);
	}
	
	public void m2() {
		
		System.out.println("in child m2 method");
	}
	
	
	public void m3() {
		System.out.println("in child m3()");
	}
	
}
