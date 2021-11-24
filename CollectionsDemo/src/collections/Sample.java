package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Sample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(70);
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(80);
		list.add(60); 
 
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(100);
		ll.addAll(list);		//
		
		System.out.println(ll);
		ll.sort(null);
		System.out.println(ll);
		
		int arr[]= {200,300,400,500};
		//list.addAll(Arrays.asList(arr));
		
		
		
		//ArrayList<Integer> temp = new ArrayList<>(;)
		//ll.addAll(arr);
		
		
	}

}
