import java.util.regex.*;
import java.lang.*;

public class PatternMatches{
	public static void main(String args[]){
		String str1 = "This is my laptop";
		String pattern = ".*my.*";
		boolean matched = Pattern.matches(pattern,str1);
		if(matched){
			System.out.println("it is matched");
		}
		else
			System.out.println("not matched");
	}
}