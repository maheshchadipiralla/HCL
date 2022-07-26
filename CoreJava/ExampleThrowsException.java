import java.io.*;
import java.util.*;

public class ExampleThrowsException{
	void method1(int num) throws IOException, ArithmeticException{
		if(num >10)
			throw new IOException("IOException Occured");
		else
			throw new ArithmeticException("ArithmeticException Occured");
	}
	public static void main(String args[]){
		try{
			Scanner sc = new Scanner(System.in);
			int number =sc.nextInt();
			sc.close();
			System.out.println("In try Block");
			ExampleThrowsException ex = new ExampleThrowsException();
			ex.method1(number);
		}
		catch(Exception e){
			System.out.println("In catch Block");
			System.out.println(e);
		}
	}
}