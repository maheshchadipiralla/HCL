public class constructorOverloading{
	String name;
	int number;
	String city;
	constructorOverloading(int number){
		this.number=number;
	}
	constructorOverloading(String name, String city){
		this.name=name;
		this.city=city;
	}
	public static void main(String args[]){
		constructorOverloading c = new constructorOverloading(45);
		System.out.println(c.number);
		constructorOverloading c1 = new constructorOverloading("mahesh","Hyderbad");
		System.out.println(c1.name);
		System.out.println(c1.city);
	}
}