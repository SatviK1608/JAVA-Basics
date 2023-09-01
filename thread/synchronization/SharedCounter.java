package thread.synchronization;

public class SharedCounter {
	static int counter=5;
	//public void incrementByOne(){
		public synchronized void incrementByOne(){
		for(int i=0;i<10;i++){
			counter++;
			System.out.println("After increment : "+counter);
		}
	}
	//public void decrementByOne(){
		public synchronized void decrementByOne(){
		for(int i=0;i<10;i++){
			counter--;
			System.out.println("After decrement : "+counter);
		}
	}

	public SharedCounter() {
		// TODO Auto-generated constructor stub
	}

	

}
