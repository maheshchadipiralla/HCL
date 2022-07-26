interface A{
	public void method1();
}
interface B{
	public void method2();
}
public class InterfaceExample2 implements A,B{
	public void method1(){
		System.out.println("Method1");
	}
	public void method2(){
		System.out.println("Method2");
	}
	public static void main(String args[]){
		InterfaceExample2 ine = new InterfaceExample2();
		ine.method1();
		ine.method2();
		A obj = new InterfaceExample2();
		obj.method1();
		obj.method2();
	}
}