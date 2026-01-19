package task;

public class product {
	
	public product(int setid) {
		System.out.println(1);
	}
	
	public product(String name,int price){
		System.out.println("bat");
		System.out.println(250);
	}
	

	
	public static void main(String[] args) {
		
		product p= new product(0);
		product p1= new product(null, 0);

	}
}

