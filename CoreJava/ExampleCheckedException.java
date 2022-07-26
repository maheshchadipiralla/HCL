public class ExampleCheckedException{
	public static void main(String args[]){
		try{
			int a = 13;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println("Exception Occured "+e);
		}
		finally{
			System.out.println("Executed");
		}
	}
}