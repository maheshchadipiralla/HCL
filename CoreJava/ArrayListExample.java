import java.util.*;

public class ArrayListExample{
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<String>();
		al.add("shravan");
		al.add("mahesh");
		al.add("ravi");
		al.add("arun");
		al.add("rahul");
		al.add("bablu");
		Iterator itr = al.iterator();
		System.out.println("Before Sorting");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		Collections.sort(al);
		System.out.println("After Sorting");
		for(String str : al){
			System.out.println(str);
		}
	}
}