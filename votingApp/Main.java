package votingApp;
import java.util.*;
public class Main {
	
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String x;
		VotingDetails[] userArray=new VotingDetails[10];
		int len=0;
		do{
			System.out.println("1. Register new user");
			System.out.println("2. Cast a vote");
			System.out.println("3. Exit");
			x=sc.nextLine();
			if(x.equals("1")){
				VotingDetails obj=new VotingDetails();
				System.out.println("Enter your details");
				while(obj.flagAge==0||obj.flagName==0||obj.flagCountry==0){
					if(obj.flagName==0){
						System.out.print("Enter your name: ");
						obj.setName(sc.nextLine().trim());
						obj.flagName=1;
					}
					if(obj.flagAge==0){
						System.out.print("Enter your age: ");
						obj.setAge(sc.nextLine().trim());
						obj.flagAge=1;
					}
					if(obj.flagCountry==0){
						System.out.print("Enter your country: ");
						obj.setCountry(sc.nextLine().trim());
						obj.flagCountry=1;
					}
					String name=obj.getName();
					String age=obj.getAge();
					String country=obj.getCountry();
					boolean k=obj.checkValidation(name,age,country);
					if(k){
						userArray[len++]=obj;
					}
				}
			}
			else if(x.equals("2")){
				System.out.println("Enter registert name");
				String n=sc.nextLine();
				System.out.println("Enter your password");
				String pass=sc.nextLine();
				boolean checkRegistration=false;
				for(int i=0;i<len;i++){
					if(userArray[i].getName().equalsIgnoreCase(n)&&userArray[i].getPassword().equals(pass)){
						checkRegistration=true;
					}
				}
				if(checkRegistration){
					System.out.println("Give your vote");
					System.out.println("1. Congress");
					System.out.println("2. BJP");
					System.out.println("3. AAP");
					String y=sc.nextLine();
					if(y.equals("1")){
						System.out.println("Your vote has been successfully casted to Congress party");
					}else if(y.equals("2")){
						System.out.println("Your vote has been successfully casted to BJP party");
					}else{
						System.out.println("Your vote has been successfully casted to AAP party");
					}
				}else{
					System.out.println("Please enter correct details");
				}
			}
			else{
				System.out.println("Thank you,Your session has ended successfully");
			}
		}while(!x.equals("3"));
		
	}

}
