package synchronisation;

public class MethodSynchCounter {
	
	private int counter;

	public MethodSynchCounter() {
		counter = 0;
	}
	
	/**
	 * With the 'synchronized' keyword, this method
	 *  Can only be accessed when no other treads are using a 
	 *  synchronized method on this object (the same one, or another).
	 */
	public synchronized void increment() {
		this.counter++;
	} 
	
	public synchronized void showValue(String msg) {
		int c = counter;
		System.out.println(msg + "says: 'My c is: " + c + "'");
		System.out.println(msg + "says: 'My counter is: " + c + "'");
	}

}
