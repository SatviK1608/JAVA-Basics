package exception.example;
class MyExc extends Exception{
	public MyExc(){
		
	}
	public MyExc(String message){
		super(message);
	}
	
	@Override
	public void printStackTrace(){
		System.out.println("stackTrace of custom class MyExc");
	}
	@Override
	public String toString(){
		return "toString method of custom class MyExc";
	}
	@Override
	public String getMessage(){
		return "getMessage method of custom class MyExc";
	}

}
class My1{
	public static void test() throws MyExc{
		int a=10,b=0;
		if(b==0){
			throw new MyExc("hii");    //getMessage will print hii if not Overriden
		}
		
		System.out.println("all good "+ a/b);
	}
}
public class ThrowsCustomException {

	public ThrowsCustomException() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      My1 obj=new My1();
		try{
			
				obj.test();
			
		}catch(MyExc e){
			System.out.print("\n printStackTrace message-->  ");
				e.printStackTrace();
				System.out.println("\n toString message--->  "+e.toString());
				System.out.println("\n getMessage message--->  "+e.getMessage());
		}
		
	}

}
