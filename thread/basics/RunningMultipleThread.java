package thread.basics;

public class RunningMultipleThread extends Thread {

	public void run() {
		// TODO Auto-generated constructor stub
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunningMultipleThread obj=new RunningMultipleThread();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		
		//runs in random order i.e. visualizer like sense and gives diff order everytime
		t1.start();
		t2.start();
		t3.start();   
		
		System.out.println(Thread.currentThread());
	}

}
