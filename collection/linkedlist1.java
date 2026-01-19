package collection;

import java.util.LinkedList;

public class linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customer c= new customer(459, "ak", "amd");
		customer c1= new customer(13, "manav", "amd1");

		LinkedList<customer> al= new LinkedList<customer>();
		al.add(c);
		al.add(c1);
		
		for(customer m:al) {
			
			System.out.println(m.custdetails+" "+m.custid+" "+m.customer);
		}
	}

}
