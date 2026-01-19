package thread;

public class fourinteface extends Thread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		fourinteface f= new fourinteface();
	    f.start();
	    
	    bb1 b =new bb1();
	    b.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello");{
			for(int i=0; i<10; i++) {
				System.out.println(i);
				
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}

}

class bb1 extends Thread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hey");{
			for(int i=20; i<29; i++) {
				System.out.println(i);
				 try {
					Thread.sleep(150);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
