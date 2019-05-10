package net.antra;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter i value:");
		int i=sc.nextInt();
		int j=sc.nextInt();
	
		int div=i/j;
		System.out.println("div:"+div);
		
		
		int add=i+j;
		System.out.println("add:"+add);
		
	}
}
