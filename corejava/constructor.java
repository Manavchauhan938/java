package corejava;

public class constructor {
	
	public constructor(String name,String add) {
		
		System.out.println("ak");
	}
	
	public constructor(String city) {
		System.out.println("ahmedabad");
	}
	
	public constructor(int id) {
		System.out.println("1");
	}
	/*
	 * constructor -  
	 * 
	 *  class 
	 *  classname and const name always same 
	 *  comp 1 default const create 
	 *  own constructor - class name 
	 *  
	 *   1 without parameter 
	 *   2 with parameter 
	 * 
	 *    method nd constructor almost same 
	 *    1 name  nd constructor same as class name 
	 *    2 void 
	 *    3 call / not call 
	 *    
	 *    class- multiple constructor 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor c=new constructor(0);
		constructor c1=new constructor(null);
        constructor c2=new constructor(null, null);
	}

}
