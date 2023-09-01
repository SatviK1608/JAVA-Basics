package thread.state;

public class TimedWaiting implements Runnable {
	public void run(){
		try{
			Thread.sleep(5000);
			System.out.println(">"+Thread.currentThread().getState());
		}catch(InterruptedException e){
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	}
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		TimedWaiting t=new TimedWaiting();
		
		Thread t1=new Thread(t);
		t1.start();
		
		Thread.sleep(1000); //this time should be less than that of in run method
		System.out.println(t1.getState());
		System.out.println(t1.isAlive());
		
		/*
		 * in main thread when t1 starts, it executes run method 
		 * and puts the thread to sleep for 5second but main thread puts t1 thread to sleep for 1 second only 
		 * so after 1second thread t1 is in TIMED_WAITING as t1 has gone to sleep for 5seconds
		 * after 5seconds the thread t1 goes in RUNNING state
		 */

	}

}
