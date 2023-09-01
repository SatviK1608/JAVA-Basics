package thread.multi_threading;

public class RaceRun {

	public RaceRun() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Car("HONDA").start();
		new Car("YAMAHA").start();
		new Car("KOINEGSEGG").start();

	}

}
