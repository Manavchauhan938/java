package thread;

public class third extends Thread{

	public void run() {
		
		for(int i=0; i<=5; i++) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		third t= new third();
		xyz x = new xyz();
		
		t.start();
		x.start();
	}

}

class xyz extends Thread{
	
	public void run() {
		
       for(int i=5; i<=10; i++) {
			
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
