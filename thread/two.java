package thread;

public class two extends Thread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		two t= new two();
	    t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello akanksha");{
			for(int i=10; i<=20; i++) {
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

}
