package collection;

import java.util.ArrayList;

public class custmainpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customerpractice c=new customerpractice(123,"akanksha","manav");
		customerpractice c1=new customerpractice(459,"manav","akanksha");

		
		ArrayList<customerpractice> am= new ArrayList<customerpractice>();
		
		am.add(c);
		am.add(c1);
		
	for(customerpractice cm:am) {
		System.out.println(cm.getCustid()+" "+cm.getCustaddress()+" "+cm.getCustname());
	}
	}

}
