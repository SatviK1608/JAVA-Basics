package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example06 {

	public Example06() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pattern pattern=Pattern.compile("Ja*");     //matches to J or Ja or Ja...      
		Pattern pattern=Pattern.compile("Ja+");     //matches to Ja or Ja...      
		Matcher matcher=pattern.matcher("Java is a J technology and a platform  - Jakhuu Trainer");
		
		while(matcher.find()){
			System.out.println("Match found from "+matcher.start()+" and ends at "+(matcher.end()-1)+".");
		}

	}

}
