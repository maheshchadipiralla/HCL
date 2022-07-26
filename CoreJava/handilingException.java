public class handilingException{
	public static void main(String args[]){
		try{
			int i = 10;
			int j = 0;
			int z = i/j;
			System.out.println(z);
		}
		catch(ArithmeticException e){
			System.out.println("you cannot divide a number with 0 \n" + e);
		}
		finally{
			System.out.println("into the finally block");
		}
	}
}