package oop;
import java.util.*;

//Single --> Base Class extends Parent Class
//MultiLevel-->Base class1 extends Parent Class, Base class2 extends Base class1
//Multiple(not supported using classes in JAVA)-->Base class extends Parent class1 and Parent class2
//Hierarchical-->Base class1 and Base class2 extends Parent class
//Hybrid --> 2 or more than 2 type of inheritance

//Do we have multiple inheritance in JAVA?
	//Yes we do have multiple inheritance in JAVA but we do not have multiple inheritance of classes in JAVA.


//Interface is like a class but not a class because methods in interface have no definition and fields are public final by default and methods are abstract and with no body
//each and every method of interface needs to be implemented in lower level class which is implementing the Interface else the class will become an abstract class


//Objects of abstract classes cannot be instantiated 


class Car1{
	public Car1(){
		System.out.println("Car1");
	}
}

class Car extends Car1 implements CarInterface{
	public Car(){
		System.out.println("Car");
	}
	
	public void carName(){
			
			System.out.println(first_name+" "+last_name);	 //all methods of interface needs to be implemented here
	}
}

public class Inheritance {

	public Inheritance() {
		
	}

	public static void main(String[] args) {
			Car obj=new Car();
			obj.carName();

	}

}
