package array.arrayOfObjects;
import java.util.*;
public class Employee {
	private String[] details={"Name","Id","Designation","Team Name","Project Name"};
	private String[] data=new String[5];
	public Employee() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<5;i++){
			System.out.print("Enter " +details[i]+" : ");
			Scanner s=new Scanner(System.in);
			data[i]=s.nextLine();
		}
	}
	public void getEmployee(){
		for(int i=0;i<5;i++){
			System.out.println(details[i]+" : "+data[i]);
		}
	}
	

}
