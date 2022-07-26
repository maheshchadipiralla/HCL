//class MultiThread implements Runnable{
class MultiThread extends Thread{
	public void run(){
		try{
			System.out.println("Thread "+ Thread.currentThread().getId() +" is runninng");
		}
		catch(Exception e){
			System.out.println("Exception occured in the thread");
		}
	}
}
public class MultiThreadDemo{
	public static void main(String args[]){
		int n=15;
		for(int i=0;i<n;i++){
			MultiThread mt = new MultiThread();
			//Thread mt = new Thread(new MultiThread());
			mt.start();
		}
	}
}