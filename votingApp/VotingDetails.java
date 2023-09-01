package votingApp;

public class VotingDetails {
	private String name,age,country,password;
	static int ps=-1;
	int flagCountry=0,flagName=0,flagAge=0;
	void setName(String name){
		this.name=name;
	}
	void setAge(String age){
		this.age=age;
	}
	void setCountry(String country){
		this.country=country;
	}
	String getName(){
		return name;
	}
	String getAge(){
		return age;
	}
	String getCountry(){
		return country;
	}
	String getPassword(){
		return password;
	}
	boolean checkValidation(String n,String a,String c){
		if(n.equals("")||c.equals("")||a.equals("")||Integer.parseInt(a)<18){
			if(n.equals("")){
				System.out.println("Please enter your name");
				flagName=0;
			}
			if(a.equals("")){
				System.out.println("Please enter your age");
				flagAge=0;
			}else if(Integer.parseInt(a)<18){
				System.out.println(name+", you are not eligible for voting because your are under 18");
				return false;
			}
			if(c.equals("")){
				System.out.println("Please enter your country");
				flagCountry=0;
			}
		}
		else{
			System.out.println("You are registered successfully and your details are");
			password=Integer.toString(ps+1);
			ps++;
			System.out.println("Name:"+n);
			System.out.println("Age:"+Integer.parseInt(a));
			System.out.println("Country:"+c);
		}
		return true;
	}
	public VotingDetails() {
		
	}


}
