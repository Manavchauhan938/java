package collection;

import java.util.HashMap;
import java.util.Map;

public class mappractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashMap<Integer, String> hn= new HashMap<Integer, String>();
	
	hn.put(1, "ak");
	hn.put(2, "ak");

	for(Map.Entry<Integer, String> m:hn.entrySet()) {
		
System.out.println(m.getKey()+" "+m.getValue());
	}
		
	Map<Integer, String> hm = new HashMap<Integer, String>();
	
	hm.put(1, "true");
	hm.put(2, "false");

	for(Map.Entry<Integer, String> m1:hm.entrySet()) {
		System.out.println(m1.getKey()+" "+m1.getValue());
	}
	
	}

}
