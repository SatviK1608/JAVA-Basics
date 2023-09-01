package thread.state;

public class States {

	public States() {
		// TODO Auto-generated constructor stub
		//static enum therefore we need a class name to access it
		for(Thread.State c: Thread.State.values()){
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new States();
	}

}
