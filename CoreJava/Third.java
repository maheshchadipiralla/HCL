class First{
	public First(){
		System.out.println("First");
	}
}
class Second extends First{
	public Second(){
		System.out.println("Second");
	}
}
public class Third extends Second{
	public Third(){
		System.out.println("Third");
	}
	public static void main(String args[]){
		Third t = new Third();
	}		
}