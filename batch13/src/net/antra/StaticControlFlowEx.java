package net.antra;

public class StaticControlFlowEx {

	static int x=34;
	static {
		
		System.out.println("in static block 1");
	}
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		
		
		m1();
		System.out.println("in main method");
		
	}
	
	public static void m1() {
		System.out.println("in m1 method of staticExample");
		System.out.println("y:"+y);
	}
	
	static {
		System.out.println("in second static block");
	}
	static int y=10;
}
