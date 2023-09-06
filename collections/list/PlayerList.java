package collections.list;
import  java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class PlayerList {

	public PlayerList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		/*Collection
		 * boolean add(E e);
		 * boolean addAll(Collection<? extends E> c);
		 */
		
		
		/*Collection<String> player=new ArrayList<>();
		//Exact way-->  Collection<String> player=new ArrayList<String>();
		
		
		player.add("Satvik");                     
		player.add("Suryam");
		player.add("Aayush");
		player.add("Madhav");
		
		System.out.println(player);         //prints all the values in [] form
		
		System.out.println("All players - ");
		for(String name : player){
			System.out.println(name);
		}*/
		
		
		/*List
		 *  boolean add(E e);
		 *  void add(int index,E element);
		 *  boolean addAll(Collection<? extends E> c);
		 *  boolean addAll(int index,Collection<? extends E> c);
		 */
		
		
		/*List<String> player=new ArrayList<>();
		
		player.add("Satvik");               
		player.add(0,"Suryam");
		player.add("Aayush");
		player.add("Madhav");
		
		System.out.println("All players - ");
		for(String name:player){
			System.out.println(name);
		}*/
		
		/*ArrayList
		 * ArrayList()
		 * ArrayList(Collection<? extends E> c)
		 * ArrayList(int initialCapacity)
		 * 
		 */
		
		
		/*ArrayList<String> player=new ArrayList<>();
		
		player.add("Satvik");               
		player.add(0,"Suryam");
		player.add("Aayush");
		player.add("Madhav");
		
		System.out.println("All players - ");
		for(String name:player){
			System.out.println(name);
		}	*/
		
		
		ArrayList<String> oldTeam=new ArrayList<>();
		
		oldTeam.add("Satvik");               
		oldTeam.add(0,"Suryam");
		oldTeam.add("Aayush");
		oldTeam.add("Madhav");
		
		ArrayList<String> newTeam=new ArrayList<>(oldTeam);
		
		System.out.println("All players - ");
		for(String name:newTeam){
			System.out.println(name);
		}
		
		//Runs from top to bottom and is better than forEach.Have hasNext and next method
		Iterator<String> teamIterator=newTeam.iterator();
		System.out.println("All players - ");
		while(teamIterator.hasNext()){
			String player=teamIterator.next();
			System.out.println(player);
		}
		
	//Iterator for List only ---> because we have hasPrevious and previous along with hasNext and next methods
		ListIterator<String> teamListIterator=newTeam.listIterator(newTeam.size());  //if size is passed it will not run for forward iteration
		System.out.println("All players in reverse order - ");
		while(teamListIterator.hasPrevious()){
			String player=teamListIterator.previous();
			System.out.println(player);
		}
		

	}

}
