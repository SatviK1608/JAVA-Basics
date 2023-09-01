package annotations.customAnnotationMethod;

public class CheckStagesBeforeTheCounterStart {

	public CheckStagesBeforeTheCounterStart() {
		// TODO Auto-generated constructor stub
		System.out.println("Checking All Systems ON....");
	}
	public boolean isPowerOn(){
		boolean isPowerOn=true;
		System.out.println("Power...");
		return isPowerOn;
	}
	@OnSuperPriority
	public boolean isOxygenOn(){
		boolean isOxygenOn=true;
		System.out.println("Oxygen...");
		return isOxygenOn;
	}
	@OnSuperPriority
	public boolean isFuelOn(){
		boolean isFuelOn=true;
		System.out.println("Fuel...");
		return isFuelOn;
	}
	public boolean isNetLinkOn(){
		boolean isNetLinkOn=true;
		System.out.println("NetLink...");
		return isNetLinkOn;
	}

}
