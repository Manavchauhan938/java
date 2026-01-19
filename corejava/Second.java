package corejava;

public class Second {
	
	public void add() {
		int a=5;
		int b=5;
		
		int c=a+b;
		
		System.out.println(c);
		
		
	}
	
/*/
 * 
 * 
 * method:- collection of code that code we will use for particular task
 * 
 * type of method
 * 1 user define
 * 2 in build method - java
 * 
 * syntax
 * public , private protected default
 * accessmodifier , returntype, methodname
 * 
 * 
 * below is example of user define syntax
 * 
 * public void login(){
 *  // logic
 * 
 * }
 * 
 * always write method in class,
 * 
 * for method call use also thier object
 * 
 * class object.methodname
 * 
 */
	public static void main(String[] args) {
		
    Second s= new Second();
    s.add();
    
    sub v= new sub();
    v.sub();
    
    mul a= new mul();
    a.mul();
    
    div m= new div();
    m.div();
    
	}

}


class sub{
	
	public void sub() {
		
		int a=4;
		int b=5;
		
		int c=a+b;
		
		System.out.println(c);
	}
	
	
}

class mul{
	
	public void mul() {
		
		int a=1;
		int b=4;
		
		int c=a*b;
		
		System.out.println(c);
	}
	
	
}

class div{
	
	public void div() {
		
		int a=25;
		int b=5;
		
		int c=a/b;
		
		System.out.println(c);
	}
	
	
}