package exception.example;

import java.util.Scanner;

public class Basics {

	public Basics() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		String name;
		Hello obj=new Hello(name);     //Error-->The constructor Hello(String) is undefined
		//even if we have a parameterized constructor we will get an Error---> The local variable name may not have been initialized
		*/
		
		/*
		String name=null;
		int n=name.length();         //Error--->NullPointerException(run-time)
		*/
		
		//int age="TEN";              exception-->Unresolved compilation problem: Type mismatch: cannot convert from String to int
				
		
		/*
		 * int x=5/0     -->Gives compile time exception: ArithmeticException
		 * 
		 * int a=5,b=0;
		 * int x=a/b;    --->Gives runtime exception  :ArithmeticException
		 */
		
		
		
		  //int x=Integer.parseInt(sc.next());     //if conversion not possible gives exception: NumberFormatException
		  
		  try{
			  int y=Integer.parseInt(sc.next());
		  }catch(NumberFormatException e){
			  
			  System.out.println("Please provide correct age in number format");    //for understanding of user,done by developer
			  e.printStackTrace();         //gives system generated message of the exception
		  
		  }
		
	}

}
