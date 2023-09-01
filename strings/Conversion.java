package strings;

public class Conversion {

	public Conversion() {
		// TODO Auto-generated constructor stub
		StringBuilder str1=new StringBuilder("hello");
		
		//String s=str1;          //ERROR
		String s=str1.toString(); //StringBuffer to String
		
		StringBuffer str2=new StringBuffer(s);  //String to StringBuffer
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
