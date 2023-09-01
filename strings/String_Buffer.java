package strings;
import java.util.*;

/*FOUR CONSTRUCTORS
 * public StringBuffer(){
 * 	super(16);
 * }
 * public StringBuffer(int capacity){
 * 		super(capacity);
 *}
 * public StringBuffer(String s){
 * 	super(str);
 * }
 * public StringBuffer(CharSequence s){
 * 	super(str);
 * }
 */

public class String_Buffer {

	public String_Buffer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	
		//String buffer is a simple class with more operations
		//By default capacity is 16
		//capacity increases with old_capacity*2+2
		//It is a final class
		//Contains more methods as synchronized
		//Method-->capacity(),setCharAt(),append(),delete(),deleteCharAt(),insert(),reverse();
		
		StringBuffer str=new StringBuffer("abc");
		
		str.reverse();                         //revrse()-->reverse the string and makes changes in original string
		System.out.println("reverse-->"+str);
		
		System.out.println("capacity-->"+str.capacity());
		
		String str1="hello";
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
