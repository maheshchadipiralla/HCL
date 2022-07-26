import java.util.*;

public class FibonaciSeries{
	public static void main(String args[]){
		int a = 0;
		int b = 1;
		int c = 1;
		int count;
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		sc.close();
		for(int i=0;i<count;i++){
			System.out.print(a+",");
			a=b;
			b=c;
			c=a+b;
		}
	}
}