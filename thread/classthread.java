package thread;

public class classthread extends Thread{

	public void run() {
		
		System.out.println("hello thread");
		
		for(int i=0; i<=10; i++) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
 * thread - seq of execution within a process
 * 
 * android app- testing spalsh screen - thread
 * 
 * 1 main process - multiple sub process - main process
 * 
 * 1 class - thread - start(already have this method)
 * 2 interface - runnable - run(already have this method)
 * 
 * 1 run
 * 2 start
 * 
 * life cycle
 * 
 * 1 new / born phase
 * 2 runnable
 * 3 running
 * 4 waiting
 * 5 destroy
 * 
 * 
 * */
		classthread cs = new classthread();//new
		cs.start();// runnable
	
	}

}
