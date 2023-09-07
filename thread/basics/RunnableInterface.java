package thread.basics;

public class RunnableInterface implements Runnable{

	public RunnableInterface() {
		// TODO Auto-generated constructor stub
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Main "+Thread.currentThread().getName());
		
		
		RunnableInterface obj=new RunnableInterface();
		Thread objThread=new Thread(obj);
		
		objThread.start();
		System.out.println("Main thread is running");
	}



	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Run "+Thread.currentThread().getName());
	}



	

}
