package dateTime.local;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
public class LocalDateTimeExample {

	public LocalDateTime dt;
	public LocalDateTimeExample() {
		// TODO Auto-generated constructor stub
		System.out.println("LocalDateTime");
		dt=LocalDateTime.now();
	}
	
	public void showLocalDateTime(){
		System.out.println(dt);
	}
	public void showLocalDate(){
		System.out.println(dt.toLocalDate());
	}
	public void showLocalTime(){
		System.out.println(dt.toLocalTime());
	}
	public void showLocalDateTimeOf(){
		LocalDateTime dp= LocalDateTime.of(2022,Month.JANUARY,25,6,30);   
		System.out.println(dp);
	}
	public void showLocalDateInFormat(){
		String localDate=dt.format(DateTimeFormatter.ISO_DATE); //format
		System.out.println(localDate);
	}
	
	//As Date
	
	public void showCurrentYear(){
		System.out.println("Today: "+dt.getYear());
	}
	public void showCurrentMonth(){
		System.out.println("Today: "+dt.getMonth());
	}
	public void showDayOfTheWeek(){
		System.out.println("Today: "+dt.getDayOfWeek());
	}
	public void showDayOfTheMonth(){
		System.out.println("Today: "+dt.getDayOfMonth());
	}
	public void showDayOfTheYear(){
		System.out.println("Today: "+dt.getDayOfYear());
	}
	public void showCustomLocalDate(){
		String localDate=dt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(localDate);
	}
	
	//As Time
	
	public void showCurrentHour(){
		System.out.println("Today: "+dt.getHour());
	}
	public void showCurrentMinute(){
		System.out.println("Today: "+dt.getMinute());
	}
	public void showCurrentSecond(){
		System.out.println("Today: "+dt.getSecond());
	}
	
	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTimeExample obj=new LocalDateTimeExample();
		
		obj.showLocalDateTime();
		obj.showLocalDate();
		obj.showLocalTime();
		obj.showLocalDateTimeOf();
		obj.showLocalDateInFormat();
		
		obj.showCurrentYear();
		obj.showCurrentMonth();
		obj.showDayOfTheWeek();
		obj.showDayOfTheYear();
		obj.showDayOfTheMonth();
		obj.showCustomLocalDate();
		
		obj.showCurrentHour();
		obj.showCurrentMinute();
		obj.showCurrentSecond();

	}

}
