package net.antra;

public class ExceptionEx {

	public static void main(String[] args) {
		
		doStuff();
	}
	
	public static void doStuff() {
		try {
		doMoreStuff();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void doMoreStuff() {
		
		System.out.println(1/0);
		System.out.println("in do more stuff");
		
	}
}
