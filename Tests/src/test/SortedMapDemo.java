package test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		SortedMap<Integer, String> m = new TreeMap<Integer, String>(); 
		
		m.put(111, "bhargav");
		m.put(555, "dhoni");
		m.put(333,"virat");
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"....."+ m1.getValue());
			if(m1.getKey().equals(333)){
				m1.setValue("rohit");
				
			}
			
		}
		
		System.out.println(m);
		
	}

}
