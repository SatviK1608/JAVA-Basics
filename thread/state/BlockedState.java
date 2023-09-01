package thread.state;

public class BlockedState implements Runnable {

	public void run(){
		commonResource();
	}
	private static synchronized void commonResource(){
		while(true){
			
		}
		
	}
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Thread t1=new Thread(new BlockedState());
		Thread t2=new Thread(new BlockedState());
		t1.start();
		t2.start();
		
		Thread.sleep(1000);
		//if we don't use sleep than output can be either Runnable , Runnable or Runnable , Blocked 
		
		//Blocked state and Runnable as running Thread is still completing it's execution and Blocked Thread is waiting for Runnable Thread to leave the resources
		System.out.println(t1.getState());
		System.out.println(t2.getState());   
		System.exit(0);
		
		
		/*
		 * we created 2 threads t1 and t2
		 * 
		 * t1 starts and enters the synchronized commonResource() method this means that only one thread
		 * can access it all other susbequent that try to access this method will be blocked from further
		 * execution until the current one will finish the processing
		 * 
		 * when t1 enters this method it is kept in an infinite while loop this i just to inititate heavy
		 * processing
		 */
		
	}

}
