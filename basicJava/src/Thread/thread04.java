package Thread;

public class thread04 extends Thread{
	 public static int amount = 0;
	 
	 public static void main(String[] args) {
	    thread04 thread = new thread04();
	    thread.start();
	    System.out.println(amount);
	    amount++;
	    System.out.println(amount);
	  }
	 
	 public void run() {
		    amount++;
		  }
}
