package objectClass;

public class ObjectCopy {
	public int x;
	public ObjectCopy(){
		
	}
	public ObjectCopy(ObjectCopy obj) {
		// TODO Auto-generated constructor stub
		x=obj.x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Copy Constructor
		ObjectCopy obj=new ObjectCopy();
		obj.x=10;
		ObjectCopy obj3=obj;     //shallow copy   -->mutable object here does make the changes in copied one
		ObjectCopy obj2=new ObjectCopy(obj);     //deep copy  -->does not make the changes in copied one and is of two type copy constructor and Object.clone() method
		// ObjectCopy obj2=new ObjectCopy((ObjectCopy) obj);  //deep copy
		obj.x=19;
		System.out.println(obj3.x);
		System.out.println(obj.x);
		System.out.println(obj2.x);
		
		/*		
		 * In case of methods if we want to shallow copy the fields we simply do this.fieldName=fieldName;		 
		 * 		and we want to do deep copy we do: this.fieldName=new dataType; and than we do this.fieldName=fieldName 
		*/
		
		
		
	}

}
