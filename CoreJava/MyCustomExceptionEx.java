public class MyCustomExceptionEx{
	public static void add(int a, int b)throws ArithmeticException{
		System.out.println(a/b);
	}
	public static void main(String args[]){
		try{
			add(6,0);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}