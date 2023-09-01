package markerInterface;

public class CRUD {
	Employee obj;
	public CRUD(){
		obj=new Employee();
	}
	public int addEmployee(String id,String name){
		if(obj instanceof Insertion){ //Insertion is a marker interface and object of the Employee class must implement it
			obj.setId(id);
			obj.setName(name);
			return 1;
		}
		return 0;
	}
	public void showEmployee(){
		System.out.println("Name: "+obj.getName()+" Id: "+obj.getId());
	}
}
