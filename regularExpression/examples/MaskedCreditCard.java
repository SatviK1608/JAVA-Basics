package regularExpression.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaskedCreditCard {

	public MaskedCreditCard() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cardNumber="1234-2222-3333-0911";
		
		Pattern pattern=Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");   
		Matcher matcher=pattern.matcher(cardNumber);
		
		String maskedCardNumber=matcher.replaceAll("XXXX-XXXX-XXXX-");  //replaceAll does not make changes in original String
		
		System.out.println(maskedCardNumber);

	}

}
