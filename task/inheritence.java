package task;

public class inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		suriya s= new suriya();
		s.ak();
		s.man();
		s.son();
	}

}

class manav{
	public void man() {
		System.out.println("hello");
	}
}

class akanksha extends manav{
	public void ak() {
		System.out.println("hey");
	}
}

class suriya extends akanksha{
	public void son() {
		System.out.println("beast");
	}
}