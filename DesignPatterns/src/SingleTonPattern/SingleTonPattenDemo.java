package SingleTonPattern;

public class SingleTonPattenDemo {

	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();

	}

}
