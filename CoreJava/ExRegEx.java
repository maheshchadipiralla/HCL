import java.util.regex.*;

public class ExRegEx{
	public static void main(String args[]){
		String str = "This Is My Book";
		String pattern1 = "is";
		String pattern = ".*is.*";
		boolean matches = Pattern.matches(pattern,str);
		Pattern matches1 = Pattern.compile(pattern1);
		String[] str1 = matches1.split(str);
		for(String str2:str1)
			System.out.println(str2);
		System.out.println("Does The pattern matches the string ? "+matches);
	}
}