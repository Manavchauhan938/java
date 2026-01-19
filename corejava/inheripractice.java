package corejava;

public class inheripractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ak a1= new ak();
		//a1.da();
		//a1.qa();
		
		um u= new um();
		u.ve();
		u.qa();
		u.da();
	}

}


class manav{
	public void qa(){
		
		System.out.println("qa engineer");
		
	}
}


class ak extends manav {
	public void da() {
		
		System.out.println("data analyst");
	}
}

class um extends ak{
	public void ve() {
		
		System.out.println("video editing");
	}
}