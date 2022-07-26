import java.util.*;

public class ExampleOfHashmap{
	public static void main(String args[]){
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"employee1");
		hm.put(12,"employee12");
		hm.put(31,"employee31");
		hm.put(4,"employee4");
		hm.put(7,"employee7");
		hm.put(9,"employee9");
		hm.put(66,"employee66");
		hm.put(78,"employee78");
		hm.put(99,"employee99");
		
		Set s1 = hm.entrySet();
		Iterator itr = s1.iterator();
		System.out.println("Using While loop");
		while(itr.hasNext()){
			Map.Entry m = (Map.Entry)itr.next();
			System.out.println("Key - "+ m.getKey()+"Value - "+ m.getValue());
		}
		System.out.println("Using For loop");
		for(Map.Entry me : hm.entrySet()){
			System.out.println("Key - "+ me.getKey()+"Value - "+ me.getValue());
		}
		
		TreeMap<Integer,String> t = new TreeMap<Integer,String>(hm);
		System.out.println("Sorted Hashmap");
		Set s2 = t.entrySet();
		Iterator itr1 = s2.iterator();
		while(itr1.hasNext()){
			Map.Entry m1 = (Map.Entry)itr1.next();
			System.out.println("Key - "+ m1.getKey()+"Value - "+ m1.getValue());
		}
		
	}
}