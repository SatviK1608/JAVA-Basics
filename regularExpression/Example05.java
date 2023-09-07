package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example05 {

	public Example05() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern=Pattern.compile("University",Pattern.CASE_INSENSITIVE);       
		Matcher matcher=pattern.matcher("CHITKARA UNIVERSITY university");
		
		boolean matchFound=matcher.find();

		if(matchFound){
			
			System.out.println("Match found from "+matcher.start()+" and ends at "+(matcher.end()-1)+".");
			//matcher.start and matcher.end returns the starting index and ending index+1 of the first occurrence of matched pattern
		
		}else{
			
			System.out.println("Match not found");
			
		}

	}

}
