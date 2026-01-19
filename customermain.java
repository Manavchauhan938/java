package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class customermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customer c=new customer(123,"manav","ahmedabad");
		customer c1=new customer(123459,"manavandak","ahmedad");
		customer c2=new customer(459,"ak","amd");

		ArrayList<customer> al=new ArrayList<customer>();
		
		al.add(c);
		al.add(c1);
		al.add(c2);
		
		for(customer cc:al) {
			System.out.println(cc.getCustdetails()+" "+cc.getCustid()+" "+cc.getCustomer());
		}

	}

}
