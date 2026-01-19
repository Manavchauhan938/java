package collection;

import java.util.ArrayList;

public class arraylist {

	/*
	 * collection - framework - readymade architecture - class,interface and packages(we use this three thing)
	 * 
	 * data manipulation - insert update delete fetch srt filter
	 * 
	 * 1 list - duplicate allow, vaule based 
	 * 
	 * 1 arraylist - class 2 linkedlist - class 3 list - interface
	 * 
	 * 2 set - never allow duplicate value , vaule based
	 * 
	 * 1 hashset - class 2 set - interface
	 * 
	 * 3 map -allow and not allow buplication , stoey with key
	 * 
	 * 1 hashmap - class 2 map-interface
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al= new ArrayList<String>();
		ArrayList<String> al1= new ArrayList<String>();
		ArrayList<Integer> a2= new ArrayList<Integer>();


		a2.add(4);
		a2.add(5);
		a2.add(9);
		
		al.add("java");
		al.add("java1");
		al.add("java");
		
		al1.add("python");
		al1.add("php");
		al1.add("k");
		
		for(String s:al) {
			System.out.println(s);
		}
		
		for(String s1:al1) {
			System.out.println(s1);
		}
		
		for(Integer s2:a2) {
			System.out.println(s2);
		}
	}

	
}
