package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		
		hm.put(1234, "abc");
		hm.put(56789, "def");
		hm.put(223344, "xyz");
		
		ArrayList<Integer> keys = new ArrayList<>();
		keys.addAll(hm.keySet());
		
		System.out.println(keys);
		
		for(int k:keys) {
			System.out.println("Key: "+k+" Value:" +hm.get(k));
		}
		
	}

}
