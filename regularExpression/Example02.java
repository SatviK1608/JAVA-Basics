package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example02 {

	public Example02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern=Pattern.compile("Java");                 //regex
		Matcher matcher=pattern.matcher("Java C++ Java Java");     //text
		
		int matches=0;
		while(matcher.find()){
			matches++;
		}
		System.out.println(matches);  //o/p 3
		System.out.println(matcher.find());    //false as all have iterated

	}

}
