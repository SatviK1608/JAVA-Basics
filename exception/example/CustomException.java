package exception.example;
class MyException extends Exception{
	public MyException(){
		
	}
	public MyException(String message){
		super(message);
	}
	
	@Override
	public void printStackTrace(){
		System.out.println("stackTrace of custom");
	}
	@Override
	public String toString(){
		return "toString method of custom ";
	}

}
class My {
	public static void test() throws ArithmeticException{
		int x=10/0;
		System.out.println("all good");
	}
}
public class CustomException {

	public CustomException() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			if(9>8){
				//throw new MyException("custom message");  //parameterized constructor must be defined and message is passed using superkeyword to Exception class and to print the message use getMessage of Exception class
				throw new MyException();
			}
		
	}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.toString());
	}
      My obj=new My();
		try{
			
				obj.test();
			
		}catch(Exception e){
			System.out.print("\n printStackTrace message-->  ");
				e.printStackTrace();
				System.out.println("\n toString message--->  "+e.toString());
				System.out.println("\n getMessage message--->  "+e.getMessage());
		}
		
	}

}
