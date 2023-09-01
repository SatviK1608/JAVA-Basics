package varargs;

public class VariableArguments {

	public VariableArguments() {
		
	}
	public void display(String... values){
		for(int i=0;i<values.length;i++){
			System.out.println(values[i]);
		}
	}

	public static void main(String[] args) {
		String[] values={"hello","satvik","how","are","you"};
		VariableArguments obj=new VariableArguments();
		obj.display(values);

	}

}
