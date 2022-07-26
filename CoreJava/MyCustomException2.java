import java.util.*;

class Exception3 extends Exception{
	Exception3(String s){
		super(s);
	}
}
public class MyCustomException2{
	public static void main(String args[]){
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();
		try{
			if(a>5)
			throw new Exception3("This is my custom Exception");
		else
			System.out.println("Everything is good");
		}
		catch(Exception3 exp){
			System.out.println(exp);
		}
	}
}