
package net.antra1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import net.antra.I1;
import net.antra.I2;
import net.antra.Parent;
import net.antra.Student;

public class Test {//implements I1,I2

	public static void main(String[] args) {
		
		int i=10;
		Integer i1=new Integer(i);
		Integer i2=new Integer("9");
		
		System.out.println(i+i2);
		
		Parent p=new Parent();//system class loader
		
		Scanner sc=new Scanner(System.in);//boot strap class loader
		
		//new oracle.jdbc.driver.OracleDriver();//extension class loader
		//Student st=new Student();
		//System.out.println(st.id);
		//st.m2();
		
		
		/*
		//map example
		
		Arrays.asList(1, 2, 3).stream()     // Stream<Integer>
        .map(String::valueOf)       // Stream<String>
        .map(s -> s.charAt(0));     // Stream<Character>
		*/
		
		/*//flat map example
		List<Integer> a = Arrays.asList(1, 2, 3);
		List<Integer> b = Arrays.asList(4, 5);
		List<Integer> c = Arrays.asList(6, 7, 8);

		List<List<Integer>> listOfListofInts = Arrays.asList(a, b, c);

		System.out.println("Before flattening : " + listOfListofInts);

		List<Integer> listofInts = listOfListofInts.stream()
										.flatMap(list -> list.stream())
										.collect(Collectors.toList());

		System.out.println("After flattening  : " + listofInts);*/
		
	}

/*	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	*/
}
