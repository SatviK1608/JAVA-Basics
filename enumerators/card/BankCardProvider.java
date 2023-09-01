package enumerators.card;

public class BankCardProvider {
	
	private static final String BANKNAME="HDFC";
	
	private double customerSalary;
	private static final double MINSALARY=100000.00;
	private static boolean isCustomerApplicable;
	
	private String approvedCardName;
	
	Customer customer;
	Card card;
	public BankCardProvider(Customer customer) {
		// TODO Auto-generated constructor stub
		this.customer=customer;
	}
	public void checkCustomerApplication(){
		if(customer.getCustomerSalary()>=MINSALARY){
			isCustomerApplicable=true;
		}
		else{
			isCustomerApplicable=false;
		}
	}
	
	public static boolean isCustomerApplicable(){
		return isCustomerApplicable;
	}
	
	public String getCardApproved(){
		approvedCardName=card.DEBIT_CARD.toString();
		
		System.out.println("\nAll Available Cards : ");
		System.out.println("CARD NAME"+"\t - "+"LIMIT"+" | "+"FEE"+" | "+"SALARY\n");
		
		for(Card card : Card.values()){
			System.out.println(card+" \t - "+card.getCardLimit()+" | "+card.getAnnualFee()+" | "+card.getAnnualSalary());
			
			if(customer.getCustomerSalary()>=card.getAnnualSalary()){
				this.approvedCardName=card.name();
			}
		}
		
		return approvedCardName;
	}
	
	public void showInformation(){
		System.out.println(BANKNAME+" Bank\n");		
		
		System.out.println("Customer Name: "+customer.getCustomerName());
		System.out.println("Customer Salary: "+customer.getCustomerSalary());
		
		
		if(isCustomerApplicable()){
			System.out.println("\nApproved For Card : " + "YES");
			System.out.println("\nCard Approved : "+ getCardApproved());
		}
		else{
			System.out.println("Approved For Card : "+"NO");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customerName="Satvik";
		double annualSalary=210000.00;       //can change
		
		Customer customer=new Customer(customerName,annualSalary);
		BankCardProvider obj=new BankCardProvider(customer);
		
		obj.checkCustomerApplication();
		obj.showInformation();

	}

}
