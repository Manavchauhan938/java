package thread;

public class classthreadprac extends Thread{

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
  
		classthreadprac cz= new classthreadprac();
		cz.start();
	}

}
