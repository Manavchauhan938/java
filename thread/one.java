package thread;

public class one extends Thread{
	
	public void run(){

System.out.println("hello manav");{
	
	for(int i=0; i<10; i++) {
		System.out.println(i);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		one o = new one();
		o.start();
	}

}
