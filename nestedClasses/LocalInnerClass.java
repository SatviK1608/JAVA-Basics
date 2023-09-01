package nestedClasses;

public class LocalInnerClass {
	
	private int time;
	private String[] activities;
	private final static int EXPECTED_ACTIVITIES=5;
	public LocalInnerClass() {
		// TODO Auto-generated constructor stub
	}
	public void morningTable(int time){
		//no modifiers for class is required as we already have public class at outer level which is the main class
		class Morning{
			public Morning(){
				System.out.println("Your morning schedule");
			}
			public void wakeup(int time){
				System.out.println("Wake up time "+time);
			}
			public String[] getActivities(){
				String[] morning_activities=new String[EXPECTED_ACTIVITIES];
				morning_activities[0]="Brush";
				morning_activities[1]="Coffee";
				morning_activities[2]="Bathing";
				morning_activities[3]="Prayer";
				return morning_activities;
			}
		}
		Morning objM=new Morning();       //must be declare inside the method
		objM.wakeup(time);
		String[] s=objM.getActivities();
		for(int i=0;i<s.length;i++){
			if(s[i]==null)
				break;
			System.out.println(s[i]);
		}
	}
	public void eveningTable(int time){
		//no modifiers for class is required as we already have public class at outer level which is the main class
		class Evening{
			public Evening(){
				System.out.println("\nYour evening schedule");
			}
			public void goToBed(int time){
				System.out.println("Bed time "+time);
			}
			public String[] getActivities(){
				String[] evening_activities=new String[EXPECTED_ACTIVITIES];
				evening_activities[0]="Study";
				evening_activities[1]="Dinner";
				evening_activities[2]="Youtube";
				evening_activities[3]="Sleep";
				return evening_activities;
			}
		}
		Evening objM=new Evening();       //must be declare inside the method
		objM.goToBed(time);
		String[] s=objM.getActivities();
		for(int i=0;i<s.length;i++){
			if(s[i]==null)
				break;
			System.out.println(s[i]);
		}
	}

	public static void main(String[] args) {
		LocalInnerClass obj=new LocalInnerClass();
		int time=5;
		obj.morningTable(time);
		time=23;
		obj.eveningTable(time);
		
	}

}
