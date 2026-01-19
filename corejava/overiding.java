package corejava;

public class overiding {

	
	/*
	 * method overloading - 1 class - multiple method name same and parameter same
	 * 
	 * inheritance - single
	 * child
	 * this 
	 * super
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cust1 c = new cust1();
		c.data();
	}

}

class cust{
	public void cust_details(String name) {
		System.out.println("hello");
	}
}

class cust1 extends cust{
	public void cust_detail(String address) {
		
		System.out.println("ahmedabad");
	}
	
	public void data() {
		
		this.cust_detail(null);// child method
		super.cust_details(null);// parent method
	}
}