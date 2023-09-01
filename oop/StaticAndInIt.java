package oop;
import java.util.*;
public class StaticAndInIt {

	public StaticAndInIt() {
		System.out.println("Constructor");
	}
	static{
		System.out.println("static-block");  //static-block is always called first and called implicitly by JVM
	}
	public  void main(){
		System.out.println("hello");
	}
	static void staticMethod(){
		System.out.println("static-method");     //static method needs to be called explicitly in static way
	}
	{
		System.out.println("in-it block"); //will be called before constructor
		//in-it block is only called if and only if the object of the class is created and is called by class
	}
	public static void main(String[] args) {
		StaticAndInIt obj=new StaticAndInIt();
		//System.out.println("object: "+obj);
		obj.main(); 
		staticMethod();
	}
	

}
