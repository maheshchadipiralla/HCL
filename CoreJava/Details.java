class Address{
	int streetnum;
	String city;
	String state;
	String country;
	Address(int streetnum, String city, String state, String country){
		this.streetnum=streetnum;
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
class Student{
	int rollnumber;
	String name;
	Address studentaddr;
	Student(int rollnumber, String name, Address addr){
		this.rollnumber=rollnumber;
		this.name=name;
		this.studentaddr=addr;
	}
}
public class Details{
	public static void main(String args[]){
		Address ad = new Address(673,"Hyderbad","Telangana","India");
		Student st = new Student(6532,"Mahesh",ad);
		System.out.println("Name of the Student - " + st.name);
		System.out.println("RollNumber of the Student - " + st.rollnumber);
		System.out.println("Address of the Student - " + st.studentaddr.streetnum + "," + st.studentaddr.city + "," + st.studentaddr.state + "," + st.studentaddr.country);
		
	}
}