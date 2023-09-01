import java.util.*;
class Cat{
	static class Dog{
		Dog(){
			System.out.println("bark!");
		}
	}
	Cat(int f){
		System.out.println(f);
	}
	public void greet(){
		System.out.println("meow!");
	}
};
public class Man {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="Satvik";
//		String s2=new String("Satvik");
//		//s1="satvik";
//		System.out.println(s1==s2);  gives false as s1 lies in static memory and s2 in heap
		
		
//		Cat c=new Cat(2),d=new Cat(4);    //mandatory to use dynamic allocation for objects
//		Cat.Dog a=new Cat.Dog();          //Dog class must be static for this implementation i.e nested classes
//		c.greet();
//		d.greet();
		
//		int arr1[]=new int[5];
//		int arr2[]={1,2,3,4,5};

		
 		ArrayList<Character> v=new ArrayList<Character>();    //String,Integer,Character,Boolean,Double,Float,Long,Byte
		v.add('a');
		v.add('f');
		v.add('g');
		v.add('x');
		v.add('u');
		v.add('v');
		Collections.sort(v);
		for(char i:v){
			System.out.println(i);
		}
		
		
		
	}

}
