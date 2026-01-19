package task;

public class animal {

	public void animal1() {
		System.out.println("lion");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog d =new dog();
		d.animal1();
		d.dog1();
	}

}

class dog extends animal{
	public void dog1(){
	System.out.println("cat");
	}
}