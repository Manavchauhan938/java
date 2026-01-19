package corejava;

public class abstraction {

	/*
	 * abstraction - data hide - sensitive 
	 * 
	 * name mobile email bank detail
	 * 
	 * collection abstract class and abstract method
	 * 
	 * 1 abstract class
	 *    add abstract befor the class
	 *    abstract never inialization
	 *    always depend normal
	 *    normal method and abstract method
	 * 
	 * 2 abstract method
	 *   add abstract before the method name
	 *   compulsory abstract class
	 *   never have code declaration
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		normal n= new normal();
		n.sensitivedata();
		n.sensitivedata1();
		n.normaldata();

	}

}


abstract class custDetail{
	
	public void normaldata() {
		
		System.out.println("name email mobile");
	}
	
	abstract void sensitivedata();
	abstract void sensitivedata1();	
}

class normal extends custDetail{

	@Override
	void sensitivedata() {
		// TODO Auto-generated method stub
		System.out.println("bank detail");
	}

	@Override
	void sensitivedata1() {
		// TODO Auto-generated method stub
	System.out.println("upi");	
	}
	
}
