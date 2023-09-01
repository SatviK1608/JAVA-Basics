package thread.synchronization.banking;

public class Account {
	private static Double balance=(double) 1000;
	
	public Double getBalance(){
		return balance;
	}
	public void setBalance(Double balance){
		this.balance=balance;
	}
	
}
