package oop;
import java.util.*;
public class ThisAndSuper {
	private int roll;
	private String name;
	private int desgination;
	public ThisAndSuper(int roll,String name,int designation) {
		/*This Method
			this(roll,name,designation); //it should be the first one to be written in constructors and sequence of instance variables is to be followed
											and it is same as this.roll=roll;this.name=name;this.designation=designation;
		*/
	}	
		/*Super Method  --always there in the constructor implicitly 
		 * public class Amd extends ThisAndSuper{
		 * 	private int division;
		 * public Amd(int roll,String name,int designation,int division){
		 * 	super(roll,name,designation);  //refers to or calls the particular constructor of above class (i.e the class whose fields it extends) and it should be the first one to be written
		 * 	this.division=division;
		 * }                             
		 * we can use this(roll,name,designation,division); instead of above super() method;
		 * }
		 * 
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAndSuper obj=new ThisAndSuper(1315,"Satvik",10);
	}

}
