package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDetails {

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee Details: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, List<String>> _objEmployeeDetailsMap=new HashMap<>();
		
		List<String> _objEmployeeDetailsList=new ArrayList<>();
		
		
		
		//For first employe details
		
		/*_objEmployeeDetailsList.add("satvik");
		_objEmployeeDetailsList.add("1315");
		_objEmployeeDetailsList.add("3rd year");
		_objEmployeeDetailsMap.put("101",_objEmployeeDetailsList);
		System.out.println(_objEmployeeDetailsMap);*/
		
		//or 
		
			//For first employe details
		_objEmployeeDetailsMap.put("1315",_objEmployeeDetailsList);
		_objEmployeeDetailsMap.get("1315").add("Satvik");
		_objEmployeeDetailsMap.get("1315").add("21yrs");
		_objEmployeeDetailsMap.get("1315").add("2cr.");
		
		
		
		
		
		
	}

}
