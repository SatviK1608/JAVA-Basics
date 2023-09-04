package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {

	public Unbounded() {
		// TODO Auto-generated constructor stub
	}
	public void  printData(List<?> numbers){
		for(Object obj:numbers){
			System.out.print(obj+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unbounded obj=new Unbounded();
		List<Integer> iList=new ArrayList<>();
		iList.add(1);
		iList.add(2);
		iList.add(3);
		
		obj.printData(iList);
		
		List<Double> dList=new ArrayList<>();
		dList.add(1.78);
		dList.add(2.45);
		dList.add(3.16);
		
		obj.printData(dList);
		
		
		List<String> sList=new ArrayList<>();
		sList.add("hello");
		sList.add("hi");
		sList.add("miss");
		
		obj.printData(sList);
		
	}

}
