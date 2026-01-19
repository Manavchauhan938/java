package collection;

import java.util.HashSet;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> h= new HashSet<String>();
		
		h.add("java");
		h.add("java1");
		h.add("java2");

		for(String s:h) {
			System.out.println(s);
		}
		
  Set<String> h1= new HashSet<String>();
		
		h1.add("java");
		h1.add("java1");
		h1.add("java2");

		for(String s1:h1) {
			System.out.println(s1);
		}
	}

}
