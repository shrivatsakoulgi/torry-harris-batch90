package com.torryharris.driver;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collections2 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(100);
		lhs.add(10);
		lhs.add(25);
		lhs.add(200);
		System.out.println("LinkedHashSet:"+lhs);
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(100);
		hs.add(10);
		hs.add(25);
		hs.add(200);
		
		System.out.println(hs);		// 1st
		System.exit(0);
		
		for(Integer i:hs) {			// 2nd
			System.out.println(i);
		}
		
		HashSet<String> strHs = new HashSet<String>();
		strHs.add("abc");
		strHs.add("def");
		strHs.add("xyz");
		strHs.add("aaa");
		
		// 3rd method using Iterator
		
		System.out.println("---Using Iterator---");
		
		Iterator<String> strItr = strHs.iterator();
		
		while(strItr.hasNext()) {
			System.out.println(strItr.next());
		}
		
	}

}
