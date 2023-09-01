package array.arrayOfArray;

import java.util.*;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		String[] employee=new String[2];
		String[] employeeDetails={"Id","Name","Designation","Company","Team Name","Project Name","Location"};
		String[] employeeCompleteDetails=new String[6];
		Scanner sc=new Scanner(System.in);
		String input;
		for(int e=0;e<2;e++){
			for(int i=0;i<6;i++){
				System.out.print(employeeDetails[i]+": ");
				input=sc.nextLine();
				employeeCompleteDetails[i]=employeeDetails[i]+": "+input;
			}
			//employeeCompleteDetails.toString();  it is basically an object and output will be class name and its address
			employee[e]=Arrays.toString(employeeCompleteDetails); //to get value of that object
		}
		for(int i=0;i<2;i++){
			System.out.println(employee[i]);
		}
		
		
	}
}

