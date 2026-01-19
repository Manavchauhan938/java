package collection;

import java.util.ArrayList;
import java.util.List;

public class listdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * list - abstraction - interface -never object // inialization // depend array list or linked list
		 * */

		List<String> al= new ArrayList<String>();
		
		al.add("hi");
		al.add("hello");

		for(String s:al) {
			
			System.out.println(s);
		}
		
		List<String > al1 = new ArrayList<String>();
		
		al1.add("ak");
		al1.add("manav");
		
		for(String ss:al1) {
			System.out.println(ss);
		}
	}

}
