package collections.map;
import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
public class HashMapExample {

	public HashMapExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> data=new HashMap<>();
		
		
		//put()-->Add or update value
		data.put(101, "Mercury");
		data.put(102, "Venus");
		data.put(103, "Earth");
		data.put(104, "Mars");
		data.put(105, "Jupiter");
		data.put(106, "Saturn");
		data.put(107, "Uranus");
		
		
		data.put(108,"Pluto");
		data.put(108,"Neptune"); //Update:Since 107 is present it updates it corresponding value of the key
		
		System.out.println(data);    //prints the key value pairs in object form
		
		//Retrieve Value: get(key)
		System.out.println(data.get(103));
		
		
		//Search the Key: containsKey(key);
		System.out.println(data.containsKey(104));
		
		
		//Remove the Data : remove(key)
		data.remove(108);
		System.out.println("After remove method-->"+data);
		
		
		
		
		//1. print statement
		System.out.println(data);
		
		//2. entrySet() method
		for(Map.Entry<Integer, String> entry:data.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//3. keySet() method
		for(Integer key:data.keySet()){
			System.out.print(key+" ");
		}
		
		System.out.println();
		
		//4. values() method
		for(String value: data.values()){
			System.out.print(value+" ");
		}
		
		//5. forEach Loop
		
		/*Since Java 8
		data.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+" "+entry.getValue());
		});*/
		
		
		
		
	}

}
