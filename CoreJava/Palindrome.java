import java.util.*;

public class Palindrome{
	public static void main(String args[]){
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		sc.close();
		StringBuilder sb = new StringBuilder(str);
		String str1 = sb.reverse().toString();
		if(str.equals(str1))
			System.out.println("Is a Palindrome");
		else
			System.out.println("Is not a Palindrome");
		String str2 = "  mahesh is\t";
		str2.strip();
		System.out.println(str2);
	}
}