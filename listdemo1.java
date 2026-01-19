package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customer c=new customer(4, "ak", "amd");
		customer c1=new customer(5, "manav", "amd1");

		List<customer> al=new ArrayList<customer>();
		
		al.add(c);
		al.add(c1);
		
		for(customer b:al) {
			System.out.println(b.custdetails+" "+b.custid+" "+b.customer);
		}
		
	
		List<customer> al1=new LinkedList<customer>();
		
		al1.add(c);
		al1.add(c1);
		
		for(customer b1:al1) {
			System.out.println(b1.custdetails+" "+b1.custid+" "+b1.customer);
		}
	}

}
