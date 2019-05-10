package net.antra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {
	
	public static void main(String[] args)  {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter age value:");
		int age=sc.nextInt();
		
		if(age<10) {
			
			throw new TooYoungException("please come after 18 age");
		}if(age>60) {
			
			throw new TooOldException("sorry your age has expired");
		}
		
		System.out.println("in class");
		
		
			/*try {
				throw new StudentNotFoundException("no record found");
			} catch (StudentNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		
		
		
			/*try {
				FileInputStream fis=new FileInputStream("C:\\Users\\Antra Pc\\eclipse-workspace\\batch13\\src\\abc.txt");
				Scanner sc=new Scanner(System.in);
				int i=sc.nextInt();
				//System.out.println(1/0);
				
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(ArithmeticException ae) {
				ae.printStackTrace();
			} catch(InputMismatchException im) {
				im.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("in finally");
			}*/
		
		
	}

}
