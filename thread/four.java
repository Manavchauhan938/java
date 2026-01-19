package thread;

public class four extends Thread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		four f=new four();
		f.start();
		
		bb b= new bb();
		b.start();
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++) {
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
class bb extends Thread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i=0; i<=10; i++) {
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

	