package corejava;

public class polymorphism {

	
	/*
	 * polymorphism - one interface and multiple implementation
	 * 
	 * - office - emp
	 * - tops - student
	 * 
	 * method overloading 
	 * 
	 * 1 class - more than 2 method - name same - parameter different
	 * 
	 * method overriding
	 * 
	 * below example is method overloading
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		deliveryboy d= new deliveryboy();
		d.customer(null);
		d.customer(0);
		d.customer(null, null);
		d.salary();
	}

}

class customer_details{
	
	public void customer(String name) {
		
		System.out.println("name");
	}
	
	public void customer(int mobile) {
		
		System.out.println("mobile");
	}
	
	public void customer(String address, String city) {
		
		System.out.println("ahmd and ss");
		
	}
	
}


class deliveryboy extends customer_details{
	
	public void salary() {
		
		System.out.println("fun");
	}
}