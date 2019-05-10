package net.antra;

public interface I1 {

	public static final int i=67;
	
	public abstract void m1();
	
	void m3();
	
	public default void m4() {
		System.out.println("im m4 default method of I1 inteface");
	}
	
	public static void m5() {
		System.out.println("in m5 static method of I1 inteface");
	}
}
