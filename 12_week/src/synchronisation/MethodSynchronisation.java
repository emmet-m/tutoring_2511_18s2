package synchronisation;

public class MethodSynchronisation implements Runnable {
	
	/**
	 * This is SHARED between all threads.... So they all get the same copy!
	 */
	public static MethodSynchCounter m = new MethodSynchCounter();
	
	private static final int SCALE = 1000;
	private String myName;

	public MethodSynchronisation(String name) {
		myName = name;
	}

	@Override
	public void run() {
		// Runs a thread
		
		for (int i = 0; i < SCALE*SCALE; ++i) {
			m.increment();
			m.showValue(this.myName);
		}
		
		System.out.println(this.myName + " is terminating!");
		
	}
	
	public static void main(String args[]) {
		
		Thread t1 = new Thread(new MethodSynchronisation("Thread 1"));
		Thread t2 = new Thread(new MethodSynchronisation("Thread 2"));
		
		t1.start();
		t2.start();
	}
	
	

}
