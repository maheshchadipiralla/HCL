class ExampleCustomException1 extends Exception{
	ExampleCustomException1(String str){
		super(str);
	}
}
public class ExampleCustomException{
	public static void main(String args[]){
		try{
			System.out.println("In the try block");
			throw new ExampleCustomException1("This is my custom exception");
		}
		catch(ExampleCustomException1 exp){
			System.out.println("In the catch block");
			System.out.println(exp);
		}
	}
}