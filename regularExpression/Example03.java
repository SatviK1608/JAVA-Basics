package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example03 {

	public Example03() {
		// TODO Auto-generated constructor stub
	}
	
	public int runTest(String regex,String text){
		Pattern pattern=Pattern.compile(regex);      //this is to be matched with matcher
		Matcher matcher=pattern.matcher(text);
		int matches=0;
		while(matcher.find()){
			matches++;
		}
		return matches;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example03 obj=new Example03();
		int matches1=obj.runTest("."," ");   // . means it shouldn't be null
		//int matches2=obj.runTest(".",null); //o/p is 0 (in my case its an error)
		int matches3=obj.runTest(".","foooo");
		System.out.println(matches1);
		//System.out.println(matches2);
		System.out.println(matches3);
	}

}
