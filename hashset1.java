package collection;

import java.util.HashSet;
import java.util.Set;

public class hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customer c=new customer(123,"manav","ahmedabad");
		customer c1=new customer(123459,"manavandak","ahmedad");
		customer c2=new customer(459,"ak","amd");
		
		HashSet<customer> v = new HashSet<customer>();
		
		v.add(c);
		v.add(c1);
		v.add(c2);
		
		for(customer m:v) {
		System.out.println(m.getCustdetails()+" "+m.custid+" "+m.getCustomer());	
		}
		
      Set<customer> v1 = new HashSet<customer>();
		
		v1.add(c);
		v1.add(c1);
		v1.add(c2);
		
		for(customer m1:v1) {
		System.out.println(m1.getCustdetails()+" "+m1.custid+" "+m1.getCustomer());	
		}
	}

}
