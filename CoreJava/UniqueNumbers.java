import java.util.*;

public class UniqueNumbers{
	public static void main(String args[]){
		int count = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(40);
		al.add(50);
		al.add(30);
		int s = al.size();
		for(int i=0;i<s;i++){
			for(int j=i+1;j<s;j++){
				count = 1;
				if(al.get(i).equals(al.get(j))){
					count = count + 1;
					System.out.println(count);
				}
			}
			if(count>1)
				System.out.println(al[i]+ " "+ count);
		}
	}
}