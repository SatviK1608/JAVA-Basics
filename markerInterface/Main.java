package markerInterface;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee obj2=new Employee();
//		if(obj2 instanceof Insertion){
//			System.out.println("true");        //when Employee implements Insertion interface
//		}
//		else{
//			System.out.println("false");       //when Employee does not implements Insertion interface
//		}
		CRUD obj=new CRUD();
		
		System.out.println("Employee added: "+obj.addEmployee("1315","satvik"));
		obj.showEmployee();
		
		System.out.println("Employee added: "+obj.addEmployee("1325","harshit"));
		obj.showEmployee();
		

	}

}
