package Thread;

public class thread03  extends Thread{
	public static void main(String[] args) {
		thread01 thread = new thread01();
		thread.start();
		System.out.println("This code is outside of the thread");
	}
	 public void run() {
		    System.out.println("This code is running in a thread");
		  }
}
