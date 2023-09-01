package thread.state;

public class Terminated  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=new Thread();
		t.start();
		
		System.out.println(t.isAlive()); //gives true if not terminated else false

	}

}
