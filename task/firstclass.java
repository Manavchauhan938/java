package task;

public class firstclass {

	public void name() {
		System.out.println("manav");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		firstclass f= new firstclass();
		f.name();
		
		age a= new age();
		a.age1();
		
		grade g = new grade();
		g.grade1();
	}

}

class age{
	public void age1() {
		System.out.println(23);
	}
}

class grade{
	public void grade1() {
		System.out.println("A");
	}
}