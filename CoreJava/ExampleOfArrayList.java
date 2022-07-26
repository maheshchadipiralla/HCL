import java.util.*;

public class ExampleOfArrayList{
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<String>();
		al.add("mahesh");
		al.add("ravi");
		al.add("rahul");
		for(String str : al){
			System.out.println(str.toUpperCase());
		}
	}
}