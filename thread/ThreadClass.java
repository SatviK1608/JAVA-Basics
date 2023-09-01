package thread;

public class ThreadClass extends Thread{

	public ThreadClass() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run(){
		System.out.println("child thread is running.....");
		//System.out.println("Inside: "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside: "+Thread.currentThread().getName());
		
		Thread objThread=new ThreadClass();
		objThread.start();    //starts the thread and reads + executes the run method implicitly
		System.out.println("Main thread is running....."); //prints before execution of run method of other threads
	}

}
