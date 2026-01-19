package thread;

public class intefacemultiplethreadprac extends Thread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intefacemultiplethreadprac im = new intefacemultiplethreadprac();
		im.start();
		
		master m = new master();
		m.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
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


class master extends Thread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
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