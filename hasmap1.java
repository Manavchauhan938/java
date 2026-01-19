package collection;

import java.util.HashMap;
import java.util.Map;

public class hasmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customer c= new customer(1, "ak", "amd");
		customer c1= new customer(2, "ak1", "amd");
		
		HashMap<Integer, customer> b = new HashMap<Integer, customer>();
		
		b.put(1, c);
		b.put(2, c1);
		
		for(Map.Entry<Integer, customer> n1:b.entrySet()) {
			
		int a= n1.getKey();
		customer mz = n1.getValue();
	System.out.println(a + " "+ mz.getCustid()+" "+mz.getCustomer()+" "+mz.getCustdetails());
		}
		
	Map<Integer, customer> bc= new HashMap<Integer, customer>();
	
	bc.put(1, c1);
	bc.put(2, c);
	
	for(Map.Entry<Integer, customer> n2:bc.entrySet()) {
		
		int a1 =n2.getKey();
		customer a2 = n2.getValue();
		
		System.out.println(a1 + " "+a2.getCustid()+" "+a2.getCustomer()+" "+a2.getCustdetails());
	}

	
	
	}

}
