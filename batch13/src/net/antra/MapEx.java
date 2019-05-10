package net.antra;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapEx {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		//ConcurrentHashMap hm=new ConcurrentHashMap();
		hm.put(154, "manas");
		hm.put(21, "kumar");
		hm.put(36, "manas");
		hm.put(14, "Paul");
		hm.put(22, "Bob");
		hm.put(1235, "clair");
		hm.put(64, "nancy");
		
		Set set=hm.keySet();
		
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(hm.get(it.next()));
			//hm.put(67, "Wenqi");
		}
		
		
		
		/*Collections.unmodifiedXXX()
		Collections.synchronizedXXX()*/

		
		//HashMap hm=new HashMap();
		//LinkedHashMap hm=new LinkedHashMap();
		/*Hashtable hm=new Hashtable();
		hm.put(154, "manas");
		hm.put(21, "kumar");
		hm.put(36, "manas");
		hm.put(14, "Paul");
		hm.put(22, "Bob");
		hm.put(1235, "clair");
		hm.put(64, "nancy");
		
		Set set=hm.keySet();
		
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(hm.get(it.next()));
			//hm.put(67, "Wenqi");
		}*/
		
		
		/*for(int i=0;i<hm.size();i++) {
			
			System.out.println(hm.get(i));
		}*/
		
	}
}
