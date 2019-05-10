package net.antra;

public class Sample extends Fruit{//Sample

	int m=10;
	
	static int n=45;
	
	public static void main(String[] args) {//args //main
		
		I3 i3=(k,j)->{
			return k+j;
		};
		
		
		int res=i3.add(10,20);
		System.out.println(res);
		/*Sample2 sm=new Sample2();
		sm.m4();
	
		I1.m5();*/
		//Parent p=new Parent();
		
		/*StringBuffer sb1=new StringBuffer("manas");
		StringBuffer sb2=new StringBuffer("manas");
		String str3=sb1.toString();
		String str4=sb2.toString();
		System.out.println(str3.equals(str4));
		
		
		String str=new String("manas");
		String str2="manas";*/
		/*String str1=new String("manas");
		String str2=new String("manas");
		System.out.println(str1.equals(str2));*/
		/*ImmutableEx ex=new ImmutableEx(6);
		
		ImmutableEx ex2=new ImmutableEx(7);
		*/
		//what is the difference between final and immutable?
		
		/*String str=new String("manas");
		String str2=str.concat(" kumar");
		System.out.println(str2);*/
		
		/*Student st1=new Student(1,"manas");
		Student st2=new Student(1,"manas");
		
		System.out.println(st1);
		System.out.println(st2);*/
		//System.out.println(st1==st2);
		//System.out.println(st1.equals(st2));
		
		//System.out.println(st.getClass().getName());
		/*System.out.println(st.hashCode());
		System.out.println(st);*/
		
		//Student st1=new Student();
		/*System.out.println(st1.hashCode());
		System.out.println(st);*/
		//Child ch=new Child();
		//InstanceControlFlowEx ins=new InstanceControlFlowEx();
		//InstanceControlFlowEx ins1=new InstanceControlFlowEx(3);
		
		/*Parent p=new Child();
		p.m1();
		//p.m2();//not possible
		p.m3();*/
		
		
		/*Parent p=new Parent();//m1 m3
		p.m1();
		//p.m2();//not possible
		p.m3();
		
		Child ch=new Child();//m2 m3
		ch.m1();
		ch.m2();
		ch.m3();*/
		
		
		/*Car car=new Car();
		car.setMilage(45);
		
		int i=car.getMilage();
		
		System.out.println(i);*/
		/*String str=new String("manas");
		str.concat(" kumar");
		
		System.out.println(str.length());*/
		
		/*Fruit f=new Fruit();
		System.out.println(f.i);*/
		
		/*Student st=new Student();
		st.id=67;*/
		
		
		/*Parent p=new Parent();
		System.out.println(p.parentI);
		// wrong System.out.println(p.childj);
		p.m1();
		//wrong p.m2()
		p.m3();
		
		
		Child ch=new Child();
		System.out.println(ch.childj);
		//System.out.println(ch.parentI);
		ch.m1();
		ch.m2();
		ch.m3();*/
		/*Student st1=new Student();
		System.out.println(st1.id);
		Employee e =new Employee();
		e.empId=45;
		e.m1();*/
		
		
		
		
		
	/*int i=10;
	int j=20;
	int k=30;
		
	String str="manas";
	
	//System.out.println(i+j+k+str);
	System.out.println(str+i+j+k);	*/
		
		
		/*
		int x=4;
		int y=5;
		System.out.println(x+y);
		
	
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);*/
		
		
		/*Student st1=new Student();
		System.out.println(st1.marks);
		st1.marks=89;
		System.out.println(st1.marks);
		
		Student st2=new Student();
		System.out.println(st2.marks);
		*/
		
		//System.out.println(Student.marks);
		
		
	//	System.out.println(n);
		
		
		
		/*Student st1=new Student();
		System.out.println(st1.id);
		st1.id=45;
		st1.m2();
		
		Student st2=new Student();
		System.out.println(st2.id);
		*/
		
		
		/*Sample s=new Sample();
		System.out.println(s.m);
		s.m1();*/
	
		//int i[]= {3,4,1,32,42,1,4};
		
		/*int i[]=new int[3];
		i[0]=13;
		i[1]=45;
		i[2]=32;
		
		System.out.println(i.length);
		
		for(int j=0;j<i.length;j++) {
		
			System.out.println(i[j]);
		}
		
		for(int k:i) {
			System.out.println(k);
		}
		
		*/
		
		//i[3]=59;
		
		
	
		
		
		/*int i=20;//i is an identifier
		
		byte b=123;// -128 to 127  1 byte
		System.out.println(b);
		
		short s=37;//-32768 to 32767  2 bytes 
		int y=56;//-2^31 to (2^31)-1 //4 bytes
		
		long l=57;//-2^63 to (2^63)-1 // 8 bytes
		
		float f=54.65f;// 4 bytes range: 5 to 6 decimal points 
		double d=45.34;// 8 bytes range: 14 to 15 decimal points
		
		char ch=34;// 2 bytes //ranges: not applicable
		System.out.println(ch);
		
		boolean b1=true;// no size //no range
		
		System.out.println(b1);*/
	}
	
	public void m1() {
		
	 int c;
		//System.out.println(c);
		System.out.println("in m1:"+m);
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}
