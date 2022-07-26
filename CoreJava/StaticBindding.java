class human{
	public static void speak(){
		System.out.println("he is human");
	}
}
class boy extends human{
	public static void speak(){
		System.out.println("he is a boy");
	}
}
public class StaticBindding{
	public static void main(String args[]){
		human h = new human();
		h.speak();
		human b = new boy();
		b.speak();
	}
}