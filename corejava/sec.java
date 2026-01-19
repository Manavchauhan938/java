package corejava;

public class sec {
	
	public void add() {
		
		int a=5;
		int b=4;
		
		int c=a+b;
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sec c= new sec();
		c.add();
		
		min s= new min ();
		s.min();
		
		mu m= new mu();
		m.mu();
		
		sb b= new sb();
		b.sb();
	}

}

class min {
	
	public void min() {
		int a= 18;
		int b=9;
		
		int c= a-b;
		
		System.out.println(c);
			}
	}

class mu {
	
	public void mu() {
		
		int a=4;
		int b=1;
		
		int c=a*b;
		
		System.out.println(c);
		
	}
}

class sb {
	
	public void sb(){
		
		int a=25;
		int b=5;
		
		int c=a/b;
		
		System.out.println(c);
	}
}

