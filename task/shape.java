package task;

public class shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		square s=new square();
		s.data();
	}

}

class shape1{
	public void s1(String name) {
		System.out.println("akma");
	}
}

class square extends shape1{
	public void s1(String square,String circle) {
		System.out.println("first and zero");
	}
	public void data(){
		this.s1(null, null);
		super.s1(null);
	}
}


