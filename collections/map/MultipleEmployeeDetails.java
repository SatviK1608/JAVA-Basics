package collections.map;
import java.util.*;
public class MultipleEmployeeDetails {
	private static Scanner input;
	private String N;
	
	static{
		input=new Scanner(System.in);
	}
	public MultipleEmployeeDetails(String N) {
		this.N=N;
		// TODO Auto-generated constructor stub
	}
	
	public void addEmployee(Map<String, List<String>> map){
		List<String> list=new ArrayList<>();
		System.out.println("Enter Name,Posi,Sal");
		list.add(input.nextLine());
		list.add(input.nextLine());
		list.add(input.nextLine());
		map.put(N, list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*int totalEmployee=2;
		Map<String, List<String>> m=new HashMap<>();
		
		for(int i=0;i<totalEmployee;i++){
			System.out.println("Enter ID");
			MultipleEmployeeDetails obj=new MultipleEmployeeDetails(input.nextLine());
			obj.addEmployee(m);
		}
		
		//System.out.println(m);
		
		for(Map.Entry<String,List<String>> entry:m.entrySet()){
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}*/
		
		
		
		//STORE ALL LIST VALUES AS "Arrays.asList()" IN A SINGLE LINE FOR EACG KEY
		
		Map<String,List<String>> _objM=new  HashMap<>();
		
		List<String> _objL=new ArrayList<>();
		
		_objL=Arrays.asList("satvik","hr","12lakh");
		_objM.put("1315", _objL);
		
		_objL=Arrays.asList("harshit","jnr emp","6lakh");
		_objM.put("1325", _objL);
		
		System.out.println(_objM);
		

	}

}
