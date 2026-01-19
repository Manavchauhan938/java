package collection;

import java.util.HashMap;
import java.util.Map;

public class hashmapmainprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customer c = new customer(4, "ak", "amd");
		customer c1= new customer(5, "manav", "ghatlodia");
		
		HashMap<Integer, customer> hnm = new HashMap<Integer, customer>();
		
		hnm.put(5, c1);
		hnm.put(4, c);
		
		for(Map.Entry<Integer, customer> y:hnm.entrySet()) {
			
		int az = y.getKey();
		customer ap= y.getValue();
		
		System.out.println(az+" "+ap.getCustid()+" "+ap.getCustomer()+" "+ap.getCustdetails());
		}
		
		Map<Integer, customer> uv = new HashMap<Integer, customer>();
		
	uv.put(9, c1);
	uv.put(45, c);
	
	for(Map.Entry<Integer, customer> q:uv.entrySet()) {
		
		int q1= q.getKey();
		customer q2= q.getValue();
		
		System.out.println(q1+" "+q2.getCustid()+" "+q2.getCustomer()+" "+q2.getCustdetails());
	}
	}

}
