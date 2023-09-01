package thread.state;

public class Waiting implements Runnable{
	public void run(){
		Thread t=Thread.currentThread();
		
		System.out.println("Thread started "+t.getName());
		
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Thread ended "+t.getName());
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//to keep thread into waiting state use any of the 3 -:
		
		Thread t1=new Thread(new Waiting(),"ProcessThread_01");  //passing Runnable object and name of thread
		Thread t2=new Thread(new Waiting(),"ProcessThread_02"); 
		Thread t3=new Thread(new Waiting(),"ProcessThread_03"); 
		
		//Thread scheduler manages these threads and runs any thread and after putting them in sleep Thread Schdeuler might be doing somne other processing so after it's completion awake any thread in random order 
//		t1.start();  
//		t2.start();  
//		t3.start(); 
		
		//To manage these threads we use join method which makes sure that next Thread is excuted after completion of previous Thread :: Here buffer time is 5seconds
		
		t1.start();
		t1.join();    //throws InterruptedException
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
	}

}
