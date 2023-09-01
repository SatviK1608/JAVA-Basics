package strings;

public class Basics {
	
	/*String us a Java object
		java.lang.String class is used to create and manipulate strings
		String is immutable;
	*/
	
	/*String literal---> String str1="value";
		Using new keyword--->String str2=new String("value");
	*/
	/* Comparison in strings
	 * 	1. == --> checks whether 2 string objects are identical
	 *equal-->this method compare 2 strings char by char to determine equality
	 *
	 *String a=new String(":");
	 *String b=new String(":");
	 */
	public Basics() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		String name1="hhello";
		String name2="hhello";    //name1 and name2 points to same object value
		System.out.println(name1+name2);
		System.out.println(name1==name2);       //gives true
		
		name1="hi";               //name1 now starts pointing to some new object value so name1==name2 is false
		System.out.println(name1+name2);
		name2="hi";                 //starts poitning to same object again
		System.out.println(name1==name2); //gives true
		System.out.println("\n");
		String a=new String(":");
		String b=new String(":");
		System.out.println(a==b);  //diff object so false
		System.out.println(a.equals(b));   //same chars so true
		String c=a;           //doing c=b will yield false in case of a==c
		System.out.println(a==c);  //Gives True as we are just assigning the existing instance so they are identical(c is not in string pool)
		System.out.println(a.equals(c));  //True as c has the same value as that of a
		
		
	}

}
