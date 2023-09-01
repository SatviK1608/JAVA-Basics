package thread.multi_threading;

public class Car extends Thread {
	static int count=1;
	public Car(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i+" "+getName());
			try{
				sleep((long) (Math.random()*1000));
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println(getName()+" got the "+count+" position");
		count++;
	}
	

}
