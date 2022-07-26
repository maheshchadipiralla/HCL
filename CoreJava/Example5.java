class ExampleConsOverLoad{
	int a;
	int b;
	ExampleConsOverLoad(int a){
		this.a=a;
		System.out.println(a);
	}
	ExampleConsOverLoad(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
}
public class Example5{
	public static void main(String args[]){
		ExampleConsOverLoad e1 = new ExampleConsOverLoad(5);
		ExampleConsOverLoad e2 = new ExampleConsOverLoad(5,7);
		
	}
}