package strings;

/*FOUR CONSTRUCTORS
 * public StringBuilder(){
 * 	super(16);
 * }
 * public StringBuilder(int capacity){
 * 		super(capacity);
 *}
 * public StringBuilder(String s){
 * 	super(str);
 * }
 * public StringBuilder(CharSequence s){
 * 	super(str);
 * }
 */

public class String_Builder {

	public String_Builder() {
		// TODO Auto-generated constructor stub
		
		//cStringBuilder lass that helps in performing all string operations more smartly
		//A final class
		//more optimized and faster class than StringBuffer and String
		//same methods as StringBuffer but they were synchronized
		//default capacity 16
		//when string is passed at time of initialization then capacity becomes l6+str.length() else capacity remains same if not gets full
		//capacity increases with old_capacity*2+2, if capacity gets full
		//Difference b/w StringBuffer and StringBuilder is StringBuffer is slower and synchronized.
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str=new StringBuilder("hello");
		
		str.reverse();                         //makes changes in original string
		System.out.println("reverse-->"+str);
		
		System.out.println("capacity-->"+str.capacity());
		
		String str1="morning";
		
		str.append(str1,1,4);           //append(CharSequence s,int s,int e)-->appends the string s starting from index s to index e-1 
		System.out.println("append-->"+str);
		
		str.setCharAt(5, 'D');           //setCharAt(int index,char ch)-->replaces the char at tht index with given char ch
		System.out.println("setCharAt-->"+str);
		
		str.deleteCharAt(5);           //String deleteCharAt(int ind)-->deletes char of the given index
		System.out.println("deleteCharAt-->"+str);
		str.delete(1, 3);				//String delete(int s,int e)-->delets the substring starting from index s to index e-1
		System.out.println("delete-->"+str);
		
		str.insert(2, "hii");           //String insert(int indx,DataType p)-->inserts the p of given datatype(boolean,char.char[],CharSequence,String,Object,int,float,double,long,etc) at index indx
		System.out.println("insert-->"+str);

	}

}
