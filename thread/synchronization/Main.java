package thread.synchronization;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//Object must be final as we are using it inside an Inner class defined in another method
		  final SharedCounter obj=new SharedCounter();
		 
		Thread t1=new Thread(){
			@Override
					public void run(){
						obj.incrementByOne();
					}
		};
		Thread t2=new Thread(){
			@Override
			public void run(){
				obj.decrementByOne();
			}
		};
		t1.start();
		t2.start();
		/* Thread scheduler runs the threads and we gets random order 
		 * when not used synchronized
		 * 
		 * 
		 * If synchronized is used, any of the thread is selected by 
		 * thread scheduler and that process is completed.
		 * 
		 * 
		 * Example--> increment can run first and then decrement, 
		 * and vice-versa is true.
		 */
	}

}
