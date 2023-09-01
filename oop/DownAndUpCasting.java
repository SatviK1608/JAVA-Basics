package oop;
class Mc{
	public void say(){
		System.out.println("hi --parent");	
	}
	public void speak(){
		System.out.println("how are u --parent");
	}
	public void miss(){
		System.out.println("I am only in parent class");
	}
	public static void greet(){
		System.out.println("I am static function of Mc class");
	}
}
public class DownAndUpCasting extends Mc {
	public void say(){
		System.out.println("hello --child");	
	}
	public void speak(){
		System.out.println("how u doing --child");
	}
	public void unique(){
		System.out.println("I am only in child class");
	}
	public static void greet(){
		System.out.println("I am static function of DownAndUpCasting class");
	}

	public DownAndUpCasting() {
		
	}

	public static void main(String[] args) {
		//Upcasting:	ParentClass obj=new ChildClass1(); 
		//this obj is of ParentClass which can only access the methods of ChildClass1 which are common in with ParentClass(i.e. overrided)and the methods of ParentClass which are not been overrided 
		//this obj cannot call non overrided method of ChildClass
		
		System.out.println("UPCASTING-----");
		Mc obj=new DownAndUpCasting();   //upcasting
		obj.speak();
		obj.say();
		//obj.unique();   ERROR--->The method unique() is undefined for the type Mc(parent class)
		obj.miss();
		obj.greet();        //will call function of parent class not the child class  //Warning->static function must be accessed in static way i.e. Mc.greet()
		
		
		//Downcasting: To access the methods of ChildClass which are not overriding methods from ParentClass 
		//ChildClass1 obj2=(ChildClass1) obj;         -->this obj is of ParentClass
		//now this obj2 can access all the methods of ChildClass and ParentClass
		System.out.println("\nDOWNCASTING-----");

		DownAndUpCasting obj2=(DownAndUpCasting) obj; //downcasting
		obj2.speak();
		obj2.say();
		obj2.unique();  
		obj2.miss();

	}

}
