package thread;

public class interfacethreadprac extends Thread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfacethreadprac i =new interfacethreadprac();
		i.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=5; i<=10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
