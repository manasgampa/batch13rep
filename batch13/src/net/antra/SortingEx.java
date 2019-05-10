package net.antra;

import java.util.Comparator;

public class SortingEx implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {

		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		
		if(i1<i2) {
		//return +ve if obj1 has to come after obj2	
			return +1;
		
		}else if(i1>i2) {
		//return -ve if obj1 has to come before obj2	
			return -1;
		}else {
		// return 0 of both(obj1 and obj2) are same
			return 0;
	
		}
		
		
	}

}
