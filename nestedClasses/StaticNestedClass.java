package nestedClasses;

public  class StaticNestedClass {
	private int out=10;
	private static int ou=10;
	public StaticNestedClass() {
		// TODO Auto-generated constructor stub
	}
	public static class CandidateInfo{
		private static String name;
		private static int age;
		
		private static void  setDetail(String x,int y){
			name=x;
			age=y;
			
		}
		public  void getDetail(){
			System.out.println("Name is "+name+" and age is "+age);
		}
		public void setOut(int o){
			//out=o;        //ERROR-->Cannot make a static reference to a not static field
			//ou=o;         //Can make a reference to static field
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we don't need to create object of this static inner class bcz static is run by JVM but for this the method must be a static one
		CandidateInfo obj2=new CandidateInfo();  
		//OR  StaticNestedClass.CandidateInfo obj=new StaticNestedClass.CandidateInfo();
		CandidateInfo.setDetail("Satvik", 20);    //if setDetail is not static than we have to access this using inner class object
		obj2.getDetail();                        //not static so object is used to access it
		
		
		

	}

}
