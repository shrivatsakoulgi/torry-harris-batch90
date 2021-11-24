package com.torryharris.driver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.torryharris.model.Employee;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1001, "abcd");
		hashMap.put(1004, "efgh");
		hashMap.put(1010, "mnop");
		hashMap.put(1002, "wxyz");
		
		for(Integer key:hashMap.keySet()) {
		System.out.println("Key: "+key+" Value: "+hashMap.get(key));
		}
		
		Employee ram = new Employee("Ram",1010,"Manager",50000);
 		Employee shyam = new Employee("Shyam",1002,"Lead",40000);
 		Employee siya = new Employee("Siya",1100,"Architect",55000);
 		Employee radha = new Employee("Radha",1005,"HR",45000);
 		
		HashMap<Integer, Employee> empHashMap = new HashMap<>();
		empHashMap.put(ram.getEmpId(), ram);
		empHashMap.put(shyam.getEmpId(), shyam);
		empHashMap.put(siya.getEmpId(), siya);
		empHashMap.put(radha.getEmpId(), radha);
		
		System.out.println("\n--- Employee HashMap---\n");
//		for(Integer key:empHashMap.keySet()) {
//			System.out.println("Key: "+key+" Value: "+empHashMap.get(key));
//			}
//		
//		Iterator<Integer> mapItr = empHashMap.keySet().iterator();
//		
//		while(mapItr.hasNext()) {
//			Integer key = mapItr.next();
//			System.out.println("Key: "+key+" Value: "+empHashMap.get(key));
//		}
		
		// Entry Set
		Iterator<Map.Entry<Integer, Employee>> entrySet = empHashMap.entrySet().iterator();
		
		while(entrySet.hasNext()) {
			Map.Entry<Integer, Employee> entry = entrySet.next();
			Integer key = entrySet.next().getKey();
			Employee emp = entry.getValue();
			System.out.println("Key: "+key+" Value: "+emp);
		}
	}

}
