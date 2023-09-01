package collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class PlayerSet {

	public PlayerSet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> player=new HashSet<>();   //stores in sorted manner as Collection
		
		player.add("Player_01");
		player.add("Player_02");
		player.add("Player_00");
		player.add(null);
		player.add("Player_03");
		player.add("Player_01");  //no duplicate value
		
		System.out.println(player);  //prints value in object form
		
		for(String name:player){
			System.out.println(name);
		}
		
		HashSet<String> oldTeam=new HashSet<>();   //stores in unordered manner
		oldTeam.add("satvik");
		oldTeam.add("suryam");
		oldTeam.add("madhav");
		oldTeam.add("aayush");
		oldTeam.add("harshit");
		
		HashSet<String> newTeam=new HashSet<>(oldTeam);  //oldTeam can be of any collection type
		newTeam.add("dixit");
		newTeam.add("satvik");
		
		Iterator<String> teamIterator=newTeam.iterator();
		while(teamIterator.hasNext()){
			String player1=teamIterator.next();
			System.out.println(player1);		
		}
		
		
		

	}

}
