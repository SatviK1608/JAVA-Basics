package wraperClasses;

public class Add {

	public Add() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int j=20;
		System.out.println("Sum: "+i+j);
		System.out.println("Sum: "+(i+j));
		Integer i1=10;
		Integer j1=20;
		System.out.println("Sum: "+i1+j1);
		System.out.println("Sum: "+(i1+j1));
		
		
		System.out.println("Sum: "+i+j1);
		System.out.println("Sum: "+(i+j1));
		
		Integer myobject01=new Integer(10);
		Integer myobject02=new Integer(20);
		System.out.println("Sum: "+myobject01+myobject02);
		System.out.println("Sum: "+(myobject01+myobject02));
		System.out.println("Sum: "+(i+myobject02));

		Integer a=Integer.valueOf(10);      //only takes integer values or character 
		System.out.println("\n"+a);
		
		
		//Primitve to Wrapper
		int ab=10;
		Integer ob=Integer.valueOf(i);			//similrarly for Float.valueOf(),Char.valueOf(),etc.
		
		//Wrapper object to Primitive type
		
		Integer _ob=Integer.valueOf(10);
		int p=_ob.intValue();                  //similrarly for floatValue(),charValue(),etc.
		
	}

}
