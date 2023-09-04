package generics.unbounded;

public class ArrayGenerics_Box<T> {
	
	private T[] boxData;
	
	public ArrayGenerics_Box(T[] boxData){
		this.boxData=boxData;
	}
	
	//Generic methods
	public <T> void showBoxData(T[] boxData) {
		for(T data:boxData){
			System.out.print(data+" ");
		}
		System.out.println();
	}
	
	public <T> void inspect(){
		System.out.println("T: "+boxData.getClass().getSimpleName()); //prints the type of the generic object
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] item_name={"pizza","burger","coke","fries","wrap"};
		
		ArrayGenerics_Box<String> object1=new ArrayGenerics_Box<>(item_name);
		object1.<String>showBoxData(item_name);
		object1.inspect();
		
		Double[] item_prices={600.00,100.90,44.15,80.12,250.25};
		ArrayGenerics_Box<Double> object2=new ArrayGenerics_Box<>(item_prices);
		object2.showBoxData(item_prices);
		object2.inspect();
	}

}
