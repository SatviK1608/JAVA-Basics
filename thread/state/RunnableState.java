package thread.state;

public class RunnableState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread c=new Thread();
		
		c.start();
		System.out.println(c.getState());

	}

}
