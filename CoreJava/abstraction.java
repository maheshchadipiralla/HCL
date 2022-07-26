abstract class animal{
	abstract void sound();
	public void dosomething(){
		System.out.println("print something");
	}
}
class Dog extends animal{
	public void sound(){
		System.out.println("Sound of Dog");
	}
}
class Cat extends animal{
	public void sound(){
		System.out.println("Sound of Cat");
	}
}
public class abstraction{
	public static void main(String args[]){
		animal d = new Dog();
		d.sound();
		d.dosomething();
		animal c = new Cat();
		c.sound();
		c.dosomething();
	}
}