package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example08 {

	public Example08() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Pattern pattern=Pattern.compile("Flight no.: \\d\\d\\d\\d\\d");   //for any of the atleast 5 consecutive digits 
		Matcher matcher=pattern.matcher("Flight no.: 10241a8");
		System.out.println(matcher.find());
		*/
		
		/*
		Pattern pattern=Pattern.compile("Flight no.: \\d{5}");   //for any of the atleast 5 consecutive digits  
		Matcher matcher=pattern.matcher("Flight no.: 10241a8");
		System.out.println(matcher.find());
		*/
		
		/*
		Pattern pattern=Pattern.compile("Flight no.: \\d{5,}");  //for any digit ocuring  5times or more times   
		Matcher matcher=pattern.matcher("Flight no.: 10241a8");
		System.out.println(matcher.find());
		*/
		
		/*
		Pattern pattern=Pattern.compile("^Flight no.: \\d{5,}$");   //must start with "Flight no.: " and end with a 5 or more consecutive digits   
		Matcher matcher=pattern.matcher("Flight no.: 102418");
		System.out.println(matcher.find());
		*/
		
		/*
		Pattern pattern=Pattern.compile("^Flight no.: \\d{5}$");   //must start with "Flight no.: " and end with only 5 digits   
		Matcher matcher=pattern.matcher("Flight no.: 102418");
		System.out.println(matcher.find());
		*/
		
		/*
		Pattern pattern=Pattern.compile("[fF]light no.: \\d{5,}");   //take any one out of the f and F AND  digit ocuring  5times or more times
		Matcher matcher=pattern.matcher("Flight no.: 102418");
		System.out.println(matcher.find());
		*/
		
		Pattern pattern=Pattern.compile("^(f|F|AF)light no.: \\d{5,}");   //take any one out of the f,F and AF AND  digit ocuring  5times or more times
		Matcher matcher=pattern.matcher("AFlight no.: 102418");
		System.out.println(matcher.find());
		
		
		
		
		

	}

}
