package SingleTonPattern;

public class SingleTonPattenDemo {
	public static void main(String[] args) {
		SingleTonObject object1 = SingleTonObject.getInstance("SingleTon");
		System.out.println(object1.value);
		object1.myMethod();
	}
}
