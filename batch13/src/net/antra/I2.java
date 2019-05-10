package net.antra;

public interface I2 {
	
	public void m2();
	void m3();
	public default void m4() {
		System.out.println("im m4 default method of I2 inteface");
	}

}
