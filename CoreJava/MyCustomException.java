class MyException extends Exception{
	String str1;
	MyException(String str2){
		str1=str2;
	}
	public String toString(){
		return ("MyException Occured :"+str1);
	}
}
public class MyCustomException{
	public static void main(String args[]){
		try{
			System.out.println("Try block");
			throw new MyException("This is My Exception");
		}
		catch(MyException exp){
			System.out.println("Catch block");
			System.out.println(exp);
		}
	}
}