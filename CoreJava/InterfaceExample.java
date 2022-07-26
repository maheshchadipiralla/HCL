interface ExampleInterface{
	public void sound();
	public void doSomething();
}
class animal1 implements ExampleInterface{
	public void sound(){
		System.out.println("Animal sound");
	}
	public void doSomething(){
		System.out.println("---------");
	}
}
class Dog1 implements ExampleInterface{
	public void sound(){
		System.out.println("Dog sound");
	}
	public void doSomething(){
		System.out.println("**********");
	}
}
public class InterfaceExample{
	public static void main(String args[]){
		animal1 a = new animal1();
		Dog1 d = new Dog1();
		a.sound();
		a.doSomething();
		d.sound();
		d.doSomething();
	}
}