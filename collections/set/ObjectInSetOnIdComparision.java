package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;



public class ObjectInSetOnIdComparision {
	private int id;
	private String name;
	private int age;
	private String location;
	private int goals;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public ObjectInSetOnIdComparision(int id,String name,int age,String location,int goals) {
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
		this.location=location;
		this.goals=goals;
		this.id=id;
	}
	//Two players are equal if their id's are equal
	//So to avoid this we have to override 2 methods equals() and hashCode;
	@Override
	public boolean equals(Object o){
		if(this==o) return true;
		if(o==null || getClass()!=o.getClass()) return false;
		ObjectInSetOnIdComparision player=(ObjectInSetOnIdComparision) o;
		return id==player.id;
		
	}
	@Override
	public int hashCode(){
		return Objects.hash(id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<ObjectInSetOnIdComparision> player=new HashSet<>();
		
		player.add(new ObjectInSetOnIdComparision(102,"satvik",29,"delhi",5));
		player.add(new ObjectInSetOnIdComparision(102,"satvik",29,"delhi",5));
		player.add(new ObjectInSetOnIdComparision(102,"suryam",29,"rajisthani",5));
		player.add(new ObjectInSetOnIdComparision(102,"satvik",30,"delhi",5));
		
		Iterator<ObjectInSetOnIdComparision> it=player.iterator();
		while(it.hasNext()){
			ObjectInSetOnIdComparision p=it.next();
			//System.out.println(p);
			System.out.println("{"+p.getId()+" "+p.getName()+" "+p.getAge()+" "+p.getLocation()+" "+p.getGoals()+"}");
		}
		
		

	}

}
