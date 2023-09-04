package generics.bounded;


public class Box<T extends Number> {           //work on types of Number class or it's subclasses
	
	private T[] boxData;
	
	public Box(T[] boxData){
		this.boxData=boxData;
	}
	
	//Generic methods
	public <T> void showBoxData(T[] boxData) {
		for(T data:boxData){
			System.out.print(data+" ");
		}
		System.out.println();
	}
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Double[] item_prices={600.00,100.90,44.15,80.12,250.25};
		Box<Double> object1=new Box<>(item_prices);
		object1.showBoxData(item_prices);
		
		
		
		Integer[] item_price={600,100,44,80,250};
		Box<Integer> object2=new Box<>(item_price);
		object2.showBoxData(item_price);
		
		
		
		/*Will not work as String is not a type of Number
		 
		    String[] item_name={"pizza","burger","coke","fries","wrap"};	
			Box<String> object1=new Box<>(item_name);
			object1.showBoxData(item_name);
		*/
		
	}

}
