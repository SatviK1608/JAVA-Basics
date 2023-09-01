package nestedClasses;

public class AnonymousInnerClass {

	public AnonymousInnerClass() {
		// TODO Auto-generated constructor stub
	}
	//can use class insted of interface
	interface HelloWorld{
		public void greet();
	}
	
	public void sayHello(){
		//interface object cannot be created because they have no constructor but we can give a reference to a constructor so this constructor can create an object;
		HelloWorld EnglishGreet=new HelloWorld(){
			//anonymous class
			public void  greet(){               //this function must be present in the interface
				System.out.println("Hii");
			}
			public void  say(){               //this function must be present in the interface
				System.out.println("Inside EnglishGreet");
			}
			
		};
		HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                System.out.println("Tout le monde");
            }
            
        };
		EnglishGreet.greet();
		//EnglishGreet.say();   //ERROR--> The method say() is undefined for the type AnonymousInnerClass.HelloWorld
		//this error occurred because EnglishGreet is derived from interface HelloWorld and this interface has no method say()
		frenchGreeting.greet();
		}

	
	public static void main(String[] args) {
		AnonymousInnerClass obj=new AnonymousInnerClass();
		obj.sayHello();

	}

}
