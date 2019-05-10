package net.antra;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Features {

	
	public static void main(String[] args) {
		
		List<Person> list=Arrays.asList(new Person("Sara","F",20),
				new Person("Sara","F",27),
				new Person("Bob","M",20),
				new Person("Paula","F",32),
				new Person("Paul","M",32),
				new Person("Jack","M",2),
				new Person("Jack","M",72),
				new Person("Jill","F",12)
				);
		
		
		/*BiFunction<Integer, Integer, Integer> bi=(i,j)->{return i+j;};
		
		System.out.println(bi.apply(10, 20));*/
		
		/*Function<Integer,Integer> fl=p->{
		
			return p+10;
		};
		
		Integer i1=fl.apply(10);
		System.out.println(i1);*/
		/*Function<Person,Person> f=p->{
			if(p.getGender().equals("M")) {
				return p;
			}else {
				return new Person();
			}
		};
		
		List<Person> al=list.stream().filter(p->p.getAge()>20).
				map(f).collect(Collectors.toList());
		
		al.stream().forEach(p->System.out.println(p.getAge()));*/
		//List li1=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		
		//li1.stream().forEach(i->System.out.println(i));
		//li1.parallelStream().forEach(i->System.out.println(i));
		//Consumer cm=(obj)->System.out.println(obj);
	
		
		/*list.stream().forEach((obj)->{System.out.println(obj.getAge());
						System.out.println(obj.getName());
						System.out.println(obj.getGender());});*/
		/*Iterator it=list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
	}
}
