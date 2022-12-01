package SingleTonPattern;

public class SingleTonObject {
	private static SingleTonObject instance;
	public String value;
	
	private SingleTonObject(String value) {
		this.value=value;
	}
	
	public static SingleTonObject getInstance(String value) {
		if(instance == null) {
			instance = new SingleTonObject(value);
		}
		return instance;
	}
	
	public void myMethod() {
		System.out.println("myMethod in SingleTonObject class");
	}

}
