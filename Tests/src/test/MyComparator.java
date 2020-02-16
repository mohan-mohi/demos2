package test;

import java.util.Comparator;

public class MyComparator implements Comparator {
	public int compare(Object obj1,Object obj2) {
//		Integer I1 = (Integer)obj1;
//		Integer I2 = (Integer)obj2;
//		if(I1<I2) 
//			return +1;
//		else if (I1>I2) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
			
		String s1 = obj1.toString();
		String s2 = (String)obj2;
		return -  s1.compareTo(s2);
		}
	}

			
//bhargav inserted	mohan	
	
