package generics.unbounded;

public class withGenerics_Box<T> {
	public T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public withGenerics_Box() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withGenerics_Box<String> objects=new withGenerics_Box<>();  //objects can hold string values only;
		
		objects.setObject(new String("Candy"));  //if we pass primitive values then it will implicitlly typecaste it to its respective wrapper class object
		
		
		//objects.setObject(new Integer(10));  Compile time error ->not applicable for the arguments
		
		System.out.println(objects.getObject());
		
		

	}

}
