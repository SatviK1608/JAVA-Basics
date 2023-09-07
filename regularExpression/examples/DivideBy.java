package regularExpression.examples;

import java.util.regex.*;
public class DivideBy {

	public DivideBy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pattern pattern=Pattern.compile("^(\\d+) divided by (\\d+)$");   
		Matcher matcher=pattern.matcher("10 divided by 2");
		if(matcher.find()){
			String statement="Result: "+matcher.replaceFirst("$1/$2");       //$1 means value of group1 and $2 means value of group2
			System.out.println(statement);
			
			int result=Integer.valueOf(matcher.group(1))/Integer.valueOf(matcher.group(2));
			System.out.println("Result: "+result);
			
		}
		

	}

}
