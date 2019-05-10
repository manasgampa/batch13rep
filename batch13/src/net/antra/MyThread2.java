package net.antra;

public class MyThread2 implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			Thread.yield();
			System.out.println(Thread.currentThread());	
			System.out.println("thread:"+i);
			}
		
	}
	
	public static void main(String[] args) {
		
		MyThread2 th1=new MyThread2();
		Thread t1=new Thread(th1);
		t1.start();
		
		/*MyThread2 th2=new MyThread2();
		Thread t2=new Thread(th1);
		t2.start();*/
		
		for(int i=0;i<10;i++) {
			
			System.out.println(Thread.currentThread().getName());
		}
	}

	

}
