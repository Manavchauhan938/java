package corejava;

public class inheritance {
/*
 * 
 *  child class can use all the funactionality of parent class using extend key word
 *  
*inheritence 
*
* 1 abc - 5 method - parent
* 2 xyz - 5 method - child ,abc, mno
*
* duplicate // reuse
* 
* adv of inheritence
* 
* 1 code reuseability
* 2 code optimization
* 
* 
* type of inheritence
* 
* 1 single - 1 parent and 1 child
* 2 multiple - 1 child and multiple parent class - class does not support multiple inheritence in java we have to use interface
* 3 multilevel - 1,2,3,4,5   last class become child and rest is become parents class
* 4 hybrid - combination of any two inheritence
* 5 heirarchical - 1 paretns and multiple child
* 
*below example of single inheritence
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		emp e = new emp();
		e.owner();
		e.emp_details();
		
		hr h= new hr();
		h.owner();
		h.salary();
		
		clark c= new clark();
		c.acc();
		c.owner();
		
	}

}

class emp extends ceo {
	
	public void emp_details() {
		
		System.out.println("name and salary");
		
	}
	
}

class hr extends ceo {
	
	public void salary() {
		
		System.out.println("no of days");
	}
}

class ceo {
	
	public void owner() {
		
		System.out.println("all data");
	}
}

class tech {
	
	public void test () {
		
		System.out.println("hello");
	}
}

class clark extends ceo {
	
	public void acc() {
		
		System.out.println("automation");
	}
}