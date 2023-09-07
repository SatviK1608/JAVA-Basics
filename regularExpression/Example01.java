package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example01 {

	public Example01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern=Pattern.compile("Java");      //this is to be matched with matcher
		Matcher matcher=pattern.matcher("Java");
		
		System.out.println(matcher.find());   //case sensitive and returns boolean

	}

}
