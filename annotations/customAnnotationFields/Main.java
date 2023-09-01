package annotations.customAnnotationFields;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		String CandidateName="satvik";
		int CandidateAge=18;
		ElectionCandidate obj=new ElectionCandidate(CandidateName,CandidateAge);
		
		for(Field field: obj.getClass().getDeclaredFields()){
			
			if(field.isAnnotationPresent(CandidateName.class)){
				//System.out.println(field.get(obj));
				Object objData=field.get(obj);
				
				
				//check and typecast to string
				if(objData instanceof String){
					System.out.println(String.valueOf(objData).toUpperCase());
				}
				
			}
		}

	}

}
