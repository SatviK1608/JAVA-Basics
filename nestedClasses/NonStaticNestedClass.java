package nestedClasses;

public class NonStaticNestedClass {
	private int out;
	class InnerClass{
		private int in;
		public void show(){
			System.out.println("nested class method");
		}
		public void setOut(int _out){
			out=_out;               
//this.out is not appropriate as out is not the instance variable of inner class so this cannot refer it 
//therefore, we do not keep the name of the parameter same as that of outer class field and if we keep them same and do out=out than there is no change as both will be act as the local var
		}
		public void showOut(){
			System.out.println("Outer class field value "+out);
		}
		public void showIn(){
			System.out.println("Inner class field value "+in);
		}
		public void setIn(int in){
			this.in=in;
		}
	}

	public NonStaticNestedClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticNestedClass obj=new NonStaticNestedClass();
		NonStaticNestedClass.InnerClass obj2=obj.new InnerClass();	 //object of outer class(obj) created object of inner class(obj2) but still they are different(diff hash code)
		
		//OR    NonStaticNestedClass.InnerClass obj3=new NonStaticNestedClass().new InnerClass();
		
		obj2.show();
		obj2.setIn(10);
		obj2.setOut(40);
		obj2.showIn();
		obj2.showOut();
	}

}
