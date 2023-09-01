package thread;

public class ProcessByAnonymousRunnableInterface {

	public ProcessByAnonymousRunnableInterface() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside : "+Thread.currentThread().getName());
		
		System.out.println("Creating Runnable....");
		Runnable Runnableobj=new Runnable() {   //new will create this obj in memory and Runnable() is not a constructor it acts as a connector to pass the reference of the class
			
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Inside : "+Thread.currentThread().getName());
			}
		};
		System.out.println("Creating Thread");
		Thread thread =new Thread(Runnableobj);
		thread.start();
		
		System.out.println("Main thread is running...");

	}

}
