package thread;

public class interfacethread extends Thread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfacethread i = new interfacethread();
		i.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int m=0; m<=5; m++) {
			
			System.out.println(m);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
