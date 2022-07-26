public class throwExample{
	static int i = 22;
	static int j = 30;
	static int z = i/j;
	public static void main(String args[]){
		if(z<1)
			throw new ArithmeticException("value should be greater than 1");
		else
			System.out.println("Everything is good");
	}
}