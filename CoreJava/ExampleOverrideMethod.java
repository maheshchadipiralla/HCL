class Animal{
	public void sound(){
		System.out.println("This is animal sound");
	}
}
class Cat extends Animal{
	public void sound(){
		System.out.println("This is Cat sound");
	}
}
class Dog extends Cat{
	public void sound(){
		System.out.println("This is Dog sound");
	}
}

public class ExampleOverrideMethod{
	public static void main(String args[]){
		Animal d = new Cat();
		d.sound();
	}
}