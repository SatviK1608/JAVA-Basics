package oop;
import java.util.*;
public class Encapsulation {
	
	int roll;     //instance variable
	
	//Class is a basic structure, which consists of fields and methods
	//Encapsulation means to wrap-up the fields and methods together
	public Encapsulation(){
		
	}
	public Encapsulation(Encapsulation ob) {
		// TODO Auto-generated constructor stub`
		roll=ob.roll;
	}
	public void getRoll(){          //getter
		System.out.println(roll);
	}
	public void setRoll(int r){    //setter
		roll=r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Encapsulation obj=new Encapsulation();
		int r=sc.nextInt();
		obj.setRoll(r);
		obj.getRoll();
		
		Encapsulation obj2;
		obj2=obj;  //obj2 points to the value of fields of object obj; If obj2 values are changes,the changes reflects on obj also -->Shallow copy
		obj2.getRoll();
		
		Encapsulation obj3=new Encapsulation(obj2);   //calls copy constructor and copies the values of obj2 into obj3; If obj3 values are changed,the change is not reflected in obj2 --->Deep Copy
		obj3.getRoll();

	}

}
//default values are int-0,char-null,float-0.0,boolean-false
