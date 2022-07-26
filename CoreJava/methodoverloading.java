class doaddition{
	void addition(){
		System.out.println("perform addition");
	}
	void addition(int x, int y){
		System.out.println("addition of 2 numbers = "+ x+y);
	}
	void addition(int x, int y, int z){
		System.out.println("addition of 3 numbers = "+ (x+y+z));
	}
}

public class methodoverloading{
	public static void main(String args[]){
		doaddition add = new doaddition();
		add.addition();
		add.addition(6,5);
		add.addition(7,8,9);
	}
}