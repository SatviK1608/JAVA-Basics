package strings;
import java.util.*;
public class StringClass {

	
	//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
	
	public StringClass() {
		// TODO Auto-generated constructor stub
		String s=new String("Mechanical Guruji");
		System.out.println("charAt-->"+s.charAt(0));                     //char charAt(int index)--> character at that index
		System.out.println("length-->"+s.length());
		String s2=new String("Neetu Chaii");
		s=s.concat(" "+s2);    //s=s+s2;
		System.out.println("concat-->"+s);
		String s3=new String("Paiso mein andhaa ho chuka hu");
		s=String.join(":","Hello,","My","Name","Is","Satvik");  //String.join(String delimiter,String s1,String s2,....)-->join the given string with specified delimiter
		System.out.println("join-->"+s);
		String s4=s.substring(5, 10);                        //String substring(int startIndex,int endIndex) -->returns string starting from startIndex to endIndex, where endIndex is optional field
		System.out.println("substring-->"+s4);
		
		s=s.replace(':',' ');                //String replace(CharSquence a,CharSequence b) --->replaces all the occurrences of a with b and returns it.CharSequence can have char and String values
		System.out.println("replace-->"+s);
		System.out.println("contains-->"+s.contains("Hello"));           //boolean contains(CharSequence s) -->return true if sequence is present else false
		
		String[] s5=s.split(" ");  //s5=["Hello,","My","Name","Is","Satvik"];
		
		List<String> strings = new LinkedList<String>();
	     strings.add("Java");strings.add("is");
	     strings.add("cool");
	     String message = String.join(" ", strings);       //String.join(String delimiter,List s)-->joins the contents of list with the delimiter
	     System.out.println("join-->"+message);
	     
	     String s6="hello",s7="Hello";
	     System.out.println("equals-->"+s6.equals(s7));               //boolean equals(String s7) -->Case Sensitive
	     System.out.println("equalsIgnoreCase-->"+s6.equalsIgnoreCase(s7));	//boolean equalsIgnoreCases(String s7) -->Case InSensitive
	     
	     System.out.println("startsWith-->"+s6.startsWith("el",1));		         //boolean startsWith(String exp,int searchIndex)-->starts comparing the specified string from the given offset and return true if it matches else false
	     System.out.println("endsWith-->"+s6.endsWith("lo"));		         //boolean endsWith(String exp)i)-->returns true if the original string ends with the specified string
	     
	     System.out.println("indexOf-->"+s6.indexOf("l",1));	   //int indexOf(char ch,int startIndex) -->returns firstOccur of the char starting searching from that startIndex(inclusive)
	     System.out.println("lastIndexOf"+s6.lastIndexOf("l",2));	   //int lastIndexOf(char ch,int endIndex) -->returns lastOccur of the char starting from 0 and searching till endIndex(inclusive)
	     
	     
	     String s8="satvik",s9="aayush";
	     System.out.println("compare-->"+s8.compareTo(s9));	// compareTo(string s) -->returns 0 if equal,+ve if s8>s9 and -ve if s8<s9 and the values are diff of the char
	     										//compareToIgnoreCases(string s)-->same as above but here lower and upper case of same char are treated same
	     String s10="BasketBall";
	     String s11=s10.toLowerCase();    //does not modify original string, instead returns a string with all lower cases  
	     System.out.println("toLowerCase-->"+s11);		
	     s11=s10.toUpperCase();    //does not modify original string, instead returns a string with all upper cases  
	     System.out.println("toUpperCase-->"+s11);	
	     
	     
	     String s12="What is a name?My name is Square.";
	     String s13=s12.replaceAll("name","shape");			//	String replaceAll(String s1,String s2) -->returns string in which all s1 substring is replaced by s2
	     System.out.println("replaceAll-->"+s13);
	     s13=s13.replaceFirst("shape","name");              //	String replaceFirst(String s1,String s2) -->returns string in which first occurrence of s1 substring is replaced by s2
	     System.out.println("replaceFirst-->"+s13);
	     
	     
	     String s14="      satvik      ";
	     String s15=s14.trim();             //String trim() -->removes all the starting and trailing white spaces
	     System.out.println("trim-->"+s15);
	     
	     String sf=String.format("My univ id is %d", 1315);     //static String format(String format,Object args)--->Works same as printf of C language
	     System.out.println("format-->"+sf);
	     
	     String s16="Kaushal Sir";
	     char[] arr=s16.toCharArray();   //public char[] toCharArray()-->converts the string to a character array
	     
	     
	     /*
	      * String s="     ";
	      * System.out.println("isBlank-->"+s);           //boolean is Blank()-->Returns true if the string is empty or contains only white space, otherwise false.
	      */
	     int i=2;
	     
	     
	     System.out.println("valueOf-->"+String.valueOf(i));        //String.valueOf(Any DataType)--->returns string of any primitive data-type
	     System.out.println("valueOf-->"+String.valueOf(arr,2,5));		//String.valueOf(char arr[],int offset,int count)-->return a string starting from offset index and count is the length of the subarray.(offset and count are optional but have to be used together,if done)
	     //copyValueOf(char[] a,int offset,int count)--->equivalent to valueOf(char[] a,int offset,int count)
	     
	     String val1=new String("Kau");
	     String val2="Kau";
	     System.out.println(val1==val2); //gives false as both points to diff instance
	     String val3=val1.intern();        //returns string from pool and it will be same as val2
	     //String val3=new String(val1.intern()) //return string from pool and it will be same as val1 Therefore val1==val3 gives true
	     System.out.println(val2==val3);  
	     
	     String val4=new String("Hello").intern();
	     String val5=new String("Hello").intern();
	     System.out.println(val4==val5);
	}

	public static void main(String[] args) {
		StringClass obj=new StringClass();
	}

}
