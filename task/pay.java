package task;

public class pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		creditcard c= new creditcard();
		c.gpay(0);
		c.cc(null);
		c.upi(null);
	}

}

class pay1 {
	public void gpay(int amount) {
		System.out.println(100);
	}
}

class creditcard extends pay1{
	public void cc(String bill) {
		System.out.println("cc");
	}
	
	public void upi(String upi) {
		System.out.println("upi");
	}
}