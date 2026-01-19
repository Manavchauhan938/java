package thread;

public class three extends Thread{

	public void run() {
		System.out.println("hey");{
			
			for(int i=0; i<9; i++) {
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
   three t= new three();
    t.start();
    
    mm m=new mm();
    m.start();
    
    
	}

}

class mm extends Thread{
	
public void run() {
	System.out.println("hello");{
		
		for(int i=90; i<=99; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(550);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
}
