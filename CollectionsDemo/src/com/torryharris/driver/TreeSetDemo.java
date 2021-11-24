package com.torryharris.driver;

import java.util.TreeSet;

import com.torryharris.model.Person;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> iTS = new TreeSet<>();		
		iTS.add(10);
		iTS.add(8);
		iTS.add(6);
		iTS.add(9);
		iTS.add(12);
		iTS.add(15);
		iTS.add(11);
		System.out.println(iTS);
		
		TreeSet<String> strTreeSet = new TreeSet<>();
		strTreeSet.add("mno");
		strTreeSet.add("def");
		strTreeSet.add("abc");
		strTreeSet.add("bxz");
		strTreeSet.add("xyz");
		strTreeSet.add("pqr");
		
	
		System.out.println("Treeset:\nSize "+strTreeSet.size()+"\nContents:"+strTreeSet);
		
		
		Person jon = new Person(11007, "Jon Snow", "Bengaluru", 12345678L);
		Person danerys = new Person(11002, "Danerys", "Cochin", 2233445566L);
		Person arya = new Person(11010, "Arya Stark", "Delhi", 773399477L);
		Person tyrion = new Person(11001, "Tyrion", "West Bengal", 723682192L);
		
		TreeSet<Person> personTreeSet = new TreeSet<Person>();
		
		personTreeSet.add(jon);
		personTreeSet.add(danerys);
		personTreeSet.add(arya);
		personTreeSet.add(tyrion);
		
		for(Person p:personTreeSet) {
			System.out.println(p);
		}

		//TreeSet<Person> treeSetByName = new TreeSet<Person>(new PersonSortByName());
		
	}

}
