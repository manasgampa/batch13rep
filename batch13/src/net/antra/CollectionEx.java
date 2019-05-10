package net.antra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionEx{

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		//LinkedList al=new LinkedList();
		/*al.add(10);//it is not int but it is Integer
		al.add("manas");
		al.add(new Student(1,"kumar"));*/
		//Vector al=new Vector();
		al.add(56);
		al.add(34);
		al.add(45);
		al.add(78);
		al.add(34);
		al.add(56);
		al.add(98);
		al.add(2, 105);
		al.remove(4);
		//System.out.println(al.get(5));
		
		Iterator it=al.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		Collections.synchronizedList(al);
		
		List li=Collections.unmodifiableList(al);
		li.add(6);
		
		/*for(int i=0;i< al.size(); i++) {
			
			System.out.println(al.get(i));
		}*/
		
		/*for( Object ob:al) {
			
			System.out.println(ob);
		}*/
		
		
	}

}
