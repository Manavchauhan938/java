package collection;

import java.util.HashMap;
import java.util.Map;

public class hashmapprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> z = new HashMap<Integer, String>();
		
		z.put(1, "a");
		z.put(2, "m");
		
		for(Map.Entry<Integer, String> z1:z.entrySet()) {
			System.out.println(z1.getKey()+" "+z1.getValue());
		}
		
		Map<Integer, String> o = new HashMap<Integer, String>();
		
		o.put(1, "ak");
		o.put(2, "manav");
		
		for(Map.Entry<Integer, String> ok:o.entrySet()) {
			System.out.println(ok.getKey()+" "+ok.getValue());
		}
	}

}
