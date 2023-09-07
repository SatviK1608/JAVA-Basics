package annotations.basic;

public class SuppressWarning {

	public SuppressWarning(int x) {
		// TODO Auto-generated constructor stub
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		@SuppressWarnings("unused")    
		SuppressWarning obj=new SuppressWarning(10); //Gives warning that obj is not used
		@SuppressWarnings("unused")  
		int x=10;    //Gives warning as x in not used so we use Annotation to remove that warning
	}

}
