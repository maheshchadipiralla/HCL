import java.util.*;

public class MergeTwoList{
	public static void main(String args[]){
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1.add(4);
		list1.add(45);
		list1.add(6);
		list1.add(87);
		list2.add(45);
		list2.add(47);
		list2.add(48);
		list2.add(42);
		List<Integer> mergeList = new ArrayList<Integer>(list1);
		mergeList.addAll(list2);
		System.out.println(mergeList);
		
		String str = "aabbbsasscacfgafagf";
		String str1 = str.replace("a"," ");
		System.out.println(str1);
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is: " + s1 == s2);
	}
}