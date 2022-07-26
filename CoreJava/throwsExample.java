public class throwsExample{
	public void addition() throws ArithmeticException{
		int i = 20;
		int j = 0;
		System.out.println((i/j));
	}
	public static void main(String args[]){
		try{
			throwsExample te = new throwsExample();
			te.addition();
			System.out.println("Succesfully executed");
		}
		catch(ArithmeticException e){
			System.out.println("Exception caught in catch block");
		}
	}
}