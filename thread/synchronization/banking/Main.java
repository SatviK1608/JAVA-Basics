package thread.synchronization.banking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction objT=new Transaction();
		
		double amountToDeposit=100;
		double amountToWithdraw=500;
		
		Deposit objDT=new Deposit(objT,amountToDeposit);
		Withdrawal objWT=new Withdrawal(objT,amountToWithdraw);
		
		
		Thread husband=new Thread(objDT);
		Thread wife=new Thread(objWT);
		
		husband.start();
		wife.start();
		
		/*If not synchronized-->
		 * output:After Withdraw: 600.0
			After Deposit: 600.0
			
			-->This happens because when we are about to withdraw 500 from 1000,
				it goes for sleep for 5seconds and in the meantime the account  gets
				deposited by 100 so the balance becomes 1100 and it goes for sleep 
				and from that 500 is withdrawn, so balance becomes 600.And now the 
			    deposit process thread awakes+fetches the bal. update by withdrawal
				Now after the completion of both process we get balance as 600.
		 
		 */

	}

}
