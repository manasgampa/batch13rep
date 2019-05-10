package net.antra;

public class Mythread1 extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println(Thread.currentThread());	
		//Thread.yield();
		//System.out.println("thread:"+i);
		}
	}
	
	public static void main(String[] args) {
		
		Mythread1 m1=new Mythread1();
		m1.setName("manas");
		m1.setPriority(Thread.MAX_PRIORITY);//min 1,max 10, norm 5
		m1.start();
		
		Mythread1 m2=new Mythread1();
		m2.setName("kumar");
		m2.start();
		//System.out.println("after thread in main method:");
		
		
		/*for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread());
			//System.out.println("in main method i:"+i);
		}*/
		
	}

}
