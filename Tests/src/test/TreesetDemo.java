package test;

import java.util.TreeSet;

public class TreesetDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add("Roja");
		t.add("shobarani");
		t.add("Rajkumar");
		t.add("Gangabhavani");
		t.add("Ramulamma");
		//t.add(20);
		System.out.println(t);
		  
		
		
		
	}

}
