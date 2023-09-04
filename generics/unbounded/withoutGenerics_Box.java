package generics.unbounded;

public class withoutGenerics_Box {

		
	private Object object;
	
	public withoutGenerics_Box() {
		// TODO Auto-generated constructor stub
	}
	public void set(Object object){
		this.object=object;
	}
	public Object get(){
		return object;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withoutGenerics_Box object=new withoutGenerics_Box();
		
		object.set(new String("Candy"));
		System.out.println(object.get());
		
		object.set(new Double(100.00));
		System.out.println(object.get());
	}

}
