package oop;
class Parent{
	public void show(){
		System.out.println("show of parent");
	}
}
class Child extends Parent{
	@Override
	public void show(){
		System.out.println("show of child");
	}
}
public class Polymorphism {

	// Polymorphism --> Many forms of a single method
	// Two types    --> Run-time and Compile-time
	
	private int a;
	private int b;
	private int c;
	private int d;
	public Polymorphism() {
		// TODO Auto-generated constructor stub
	}
	
	
	//	Compile-time
	public void Method(int a,int b,int c,int d){
		System.out.println("Four arguments");
	}
	public void Method(int a,int b,int c){
		System.out.println("Three arguments");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism obj=new Polymorphism();
		obj.Method(1, 2, 3);
		obj.Method(1, 2, 3, 4);
		
		
		Parent obj2=new Child();   //run-time || method overriding
		obj2.show();               //calls child class method
		
		Parent obj3=new Parent();
		obj3.show();				//calls parent class method
		
//		Child obj4=(Child) new Parent();  Gives error:Parent cannot be cast to Child(even if we have done downcasting)
//		obj4.show();            

	}

}
