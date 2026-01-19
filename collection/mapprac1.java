package collection;

import java.util.HashMap;
import java.util.Map;

public class mapprac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customer c= new customer(1, "am", "amd");
		customer c1= new customer(2, "cc", "amd1");
		
		HashMap<Integer, customer> hmm = new HashMap<Integer, customer>();
		hmm.put(1, c1);
		hmm.put(2, c);
		
		for(Map.Entry<Integer, customer> a:hmm.entrySet()) {
			
			int a1= a.getKey();
			customer a2 = a.getValue();
			
		System.out.println(a1 + " " +a2.custid+" "+a2.customer+" "+a2.custdetails);
		}

		Map<Integer, customer> h1= new HashMap<Integer, customer>();
		
		h1.put(1, c);
		h1.put(2, c1);
		
		for(Map.Entry<Integer, customer> z: h1.entrySet()) {
			
			int z1 = z.getKey();
		customer z2 = z.getValue();
		System.out.println(z1 +" "+z2.getCustid()+" "+z2.getCustdetails()+" "+z2.getCustomer());
		
		}
	}

}
