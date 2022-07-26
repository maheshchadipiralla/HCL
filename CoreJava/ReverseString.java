import java.util.*;
import java.lang.*;

public class ReverseString{
	public static void main(String args[]){
		String str1;
		String str2;
		String rev="";
		Scanner sc = new Scanner(System.in);
		str1 = sc.next();
		str2 = sc.next();
		StringBuilder sb = new StringBuilder(str1);
		System.out.println("Reverse of the string is : "+sb.reverse());
		char[] ch = str2.toCharArray();
		sc.close();
		for(int i=(ch.length-1);i>=0;i--){
			rev = rev+ch[i];
		}
		System.out.println("Reverse of the string using for loop is : "+rev);
	}
}