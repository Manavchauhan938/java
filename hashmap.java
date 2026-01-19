package collection;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * map - map(interface),hashmap(class)
 * 
 * data key and value// value allow duplicate//entryset// in key not allow duplicate
 * 
 * number - int
 * 
 * 
 * */
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "java");
		map.put(2, "java1");
		map.put(3, "java2");

		for(Map.Entry<Integer, String> ak:map.entrySet()) {
			System.out.println(ak.getKey()+" "+ak.getValue());
		}
		
		Map<Integer, Boolean> map1= new HashMap<Integer, Boolean>();
		
				map1.put(1, true);
				map1.put(2, false);
				
				for(Map.Entry<Integer, Boolean> ak1:map1.entrySet()) {
					System.out.println(ak1.getKey()+" "+ak1.getValue());
				}
				
	}

}
