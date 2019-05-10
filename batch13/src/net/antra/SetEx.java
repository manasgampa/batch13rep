package net.antra;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx {
	
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet(new SortingEx());
		ts.add(12);
		//ts.add("manas");
		ts.add(3);
		ts.add(6);
		ts.add(18);
		ts.add(12);
		ts.add(78);
		ts.add(52);
		ts.add(32);
		ts.add(89);
		ts.add(1);
		
		System.out.println(ts);
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//HashSet hs=new HashSet();
		/*LinkedHashSet hs=new LinkedHashSet();
		hs.add(34);
		hs.add(65);
		hs.add(89);
		hs.add(12);
		hs.add(90);
		hs.add(89);
		hs.add(67);
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
	}

}
