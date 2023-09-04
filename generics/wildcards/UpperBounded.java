package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBounded {

	public UpperBounded() {
		// TODO Auto-generated constructor stub
	}
	public void  printData(List<? extends Number> numbers){
		for(Object obj:numbers){
			System.out.print(obj+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpperBounded obj=new UpperBounded();
		List<Integer> iList=new ArrayList<>();
		iList.add(1);
		iList.add(2);
		iList.add(3);
		
		obj.printData(iList);
		
		
		List<Double> dList=new ArrayList<>();
		dList.add(1.27);
		dList.add(2.43);
		dList.add(3.89);
		
		obj.printData(dList);
		
		
		List<String> sList=new ArrayList<>();
		sList.add("hello");
		sList.add("hi");
		sList.add("miss");
		
		//obj.printData(sList);  Error as it can have only Number type
		
	}

}
