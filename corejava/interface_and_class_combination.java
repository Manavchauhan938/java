package corejava;

public class interface_and_class_combination extends display implements test,test1,test2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interface_and_class_combination i= new interface_and_class_combination();
		i.cust();
		i.data();
		i.data1();
		i.data2();
		i.data3();
		
		
	}

	@Override
	public void data3() {
		// TODO Auto-generated method stub
		System.out.println("h");

	}

	@Override
	public void data2() {
		// TODO Auto-generated method stub
		System.out.println("e");

	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("l");

	}

	@Override
	public void data1() {
		// TODO Auto-generated method stub
		System.out.println("o");

	}

}

interface test{
	public void data();
	public void data1();
	
}

interface test1{
	public void data2();
}

interface test2{
	public void data3();
}

class display{
	public void cust() {
		System.out.println("manual");
	}
}