package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {

	public LowerBounded() {
		// TODO Auto-generated constructor stub
	}
	public void  printData(List<? super Integer> numbers){
		for(Object obj:numbers){
			System.out.print(obj+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowerBounded obj=new LowerBounded();
		List<Number> iList=new ArrayList<>();
		iList.add(1.02);
		iList.add(2.91);
		iList.add(3.61);
		
		obj.printData(iList);  
		
		
		List<Integer> sList=new ArrayList<>();
		sList.add(1);
		sList.add(2);
		sList.add(3);
		
		obj.printData(sList); 
		
	}

}
