public class Factorial{
	static int fact(int n){
		if(n == 0)
			return 1;
		else
			return (n*fact(n-1));
	}
	public static void main(String args[]){
		int fact = 1;
		int n = 6;
		fact = fact(n);
		System.out.println(fact);
	}
}