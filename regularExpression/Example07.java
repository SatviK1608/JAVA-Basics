package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example07 {

	public Example07() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String regex="Python";
			String sentence="Python --> Regular Expression In Python";
			String replace="Java";
			
			System.out.println("Before Replacing: "+sentence);
			
			
	
			Pattern pattern=Pattern.compile(regex);
			
			Matcher matcher=pattern.matcher(sentence);
			
			//sentence =matcher.replaceFirst(replace);   //replace only first occurrence of matched regex
			
			sentence=matcher.replaceAll(replace);     //replace all the occurrences of matched regex
			
			
			System.out.println("After Replacing: "+sentence);

	}

}
