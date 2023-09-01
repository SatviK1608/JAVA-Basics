package enumerators.card;

public enum Card {
	DEBIT_CARD(100,0.00,50000.00),
	CREDIT_CARD(1000,100000.00,200000.00),
	SHOPPING(1500,150000.00,300000),
	BUSINESS(2000,250000.00,500000),
	INTERNATIONAL(5000,500000.00,1000000);
	
	private final int annual_fee;
	private final double card_limit;
	private final double annual_salary;
	
	private Card(int annual_fee,double card_limit,double annual_salary){
		this.annual_fee=annual_fee;
		this.card_limit=card_limit;
		this.annual_salary=annual_salary;
	}
	protected int getAnnualFee(){
		return annual_fee;
	}
	protected double getCardLimit(){
		return card_limit;
	}
	protected double getAnnualSalary(){
		return annual_salary;
	}
}
