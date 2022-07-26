public class PrimeNumber{
	public static void main(String args[]){
		int first = 100;
		int last = 200;
		while(first <= last){
			boolean prime = false;
			for(int i = 2; i <= first/2; i++){
				if(first%i == 0){
					prime = true;
					break;
				}
			}
			if(!prime)
				System.out.println(first + " ");
			++first;
		}
}
}