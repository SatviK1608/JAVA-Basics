package annotations.customAnnotationMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InvocationTargetException,IllegalAccessException{
		// TODO Auto-generated method stub
		CheckStagesBeforeTheCounterStart obj=new CheckStagesBeforeTheCounterStart();
		
		for(Method method: obj.getClass().getDeclaredMethods()){
			if(method.isAnnotationPresent(OnSuperPriority.class)){
				System.out.println(method.invoke(obj));
			}
		}
		

	}

}
