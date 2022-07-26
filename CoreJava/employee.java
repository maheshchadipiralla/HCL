public class employee{
	String name;
	int id;
	employee(String name, int id){
		this.name=name;
		this.id=id;
	}
	employee(){
		this.name = "ramesh";
		this.id = 33;
	}
	
	public static void main(String args[]){
		employee emp = new employee();
		employee emp1 = new employee("mahesh", 66);
		System.out.println(emp.name);
		System.out.println(emp.id);
		System.out.println(emp1.name);
		System.out.println(emp1.id);
	}
}


