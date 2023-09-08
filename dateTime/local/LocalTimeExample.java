package dateTime.local;

import java.time.LocalTime;

public class LocalTimeExample {
	private LocalTime time;
	
	public LocalTimeExample() {
		// TODO Auto-generated constructor stub
		System.out.println("LocalTime");
		time=LocalTime.now();
	}
	public void showCurrentTime(){
		System.out.println("Time: "+time);
	}
	public void showCurrentHour(){
		System.out.println("Hour: "+time.getHour());
	}
	public void showCurrentMinutes(){
		System.out.println("Minute: "+time.getMinute());
	}
	public void showCurrentSeconds(){
		System.out.println("Second: "+time.getSecond());
	}
	public void showCurrentNanos(){
		System.out.println("Nano: "+time.getNano());
	}
	public void showNextHour(){
		System.out.println("After an Hour: "+time.plusHours(1));
	}
	public void showPreviousHour(){
		System.out.println("Before an Hour: "+time.minusHours(1));
	}
	
	public void showTimeWith_AM_PM(){
		//12 Hour clock
		System.out.println();
	}
	public static void main(String[] args){
		LocalTimeExample obj=new LocalTimeExample();
		
		obj.showCurrentTime();
		obj.showCurrentHour();
		obj.showCurrentMinutes();
		obj.showCurrentSeconds();
		obj.showCurrentNanos();
		
		
		obj.showNextHour();
		obj.showPreviousHour();
	}

}
