package oop;
import java.util.*;


//Object of Abstract class cannot be instantiated
//Abstract method can only be declared in Abstract class
//Abstract methods have no body;
//All the abstract methods of abstract class must be written with proper body in the class which is inheriting it.

/*If a class let say Concrete inherits the abstract class let say Abs2, which further inherits another abstract class let say Abs1
  than in that case abstract methods of Abs1 can be override in Abs2 or in Concrete class
  
  But, 
  If a non abstract class inherits a abstract class than later abstract methods should get override in the former class only
*/



abstract class hello{
	protected String s1;
	public hello(String s){
		s1=s;
	}
	protected void show(){
		System.out.println(s1+", You are in Abstract class");
	}
	protected abstract void greet();
}
class hi extends hello{
	public hi(String s){
		super(s);
	}
	@Override
	protected void greet(){
		System.out.println("hello  -- i am abstract method of abstract class");
	}
}

public class Abstraction {

	public Abstraction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hello obj=new hello("satvik");    ERROR(Cannot instantiate object of hello class_ ---> bcz hello is an abstract class and you cannot create its object
		hi obj=new hi("satvik");
		obj.show();
		obj.greet();
	}

}
