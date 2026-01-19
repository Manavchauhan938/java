package thread;

public class multipleclassthreadprac extends Thread{

	public void run() {
	for(int i=0; i<5; i++) {
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
		multipleclassthreadprac m= new multipleclassthreadprac();
		m.start();
		
		ak a= new ak();
		a.start();
	}

}

class ak extends Thread{
	
public void run() {
	
	for(int i=5; i<10; i++) {
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