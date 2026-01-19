package corejava;

public class interface_practice extends em implements tes1,tes{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface_practice a = new interface_practice();
		a.sensitivedata();
		a.sensidata1();
		a.sensi2();
		a.hello();
		
	}

	@Override
	public void sensitivedata() {
		// TODO Auto-generated method stub
		System.out.println("a");

	}

	@Override
	public void sensidata1() {
		// TODO Auto-generated method stub
		System.out.println("k");

	}

	@Override
	public void sensi2() {
		// TODO Auto-generated method stub
		System.out.println("m");

	}

}

interface tes{
	
	public void sensitivedata();
	public void sensidata1();
}

interface tes1{
	public void sensi2();
}

class em{
	public void hello() {
		System.out.println("tech");
	}
}