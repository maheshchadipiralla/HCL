class car{
	public void drive(){
		System.out.println("Drive the car");
	}
}
class tata extends car{
	public void brand(){
		System.out.println("Brand of the car is TATA");
	}
}
class nexas extends tata{
	public void model(){
		System.out.println("model of the car is NEXAS");
	}
}
public class ExampleInheritance extends nexas{
public static void main(String args[]){
	ExampleInheritance ei = new ExampleInheritance();
	ei.drive();
	ei.brand();
	ei.model();
}
}