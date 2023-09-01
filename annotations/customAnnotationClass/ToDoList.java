package annotations.customAnnotationClass;

@ToDoGo
public class ToDoList {

	public ToDoList() {
		// TODO Auto-generated constructor stub
		System.out.println("ToDoGo");
	}
	public void createToDoList(){
		System.out.println("Creating.....");
	}
	public void notAllowed(){
		System.out.println("Sorry, you are not allowed.");
	}

}
