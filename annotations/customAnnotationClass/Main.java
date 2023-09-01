package annotations.customAnnotationClass;

import java.lang.annotation.Annotation;



public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToDoList obj=new ToDoList();
		
		 /*obj.getClass() gives the class of the object obj 
		 * and isAnnotationPresent is a boolean method to check if annotation is present or not 
		 * now in arguments pass the Annotation and use .class as extension as at runtime it is not .java it is .class
		 */
		
		if(obj.getClass().isAnnotationPresent(ToDoGo.class)){      
			obj.createToDoList();
		}
		else{
			obj.notAllowed();
		}

	}

}
