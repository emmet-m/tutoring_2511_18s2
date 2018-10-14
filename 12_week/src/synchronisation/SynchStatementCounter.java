package synchronisation;

public class SynchStatementCounter {
	
	Object ilock; // Dummy object to act as a lock for incrementing
	Object slock; // Dummy object to act as a lock for printing

	public SynchStatementCounter() {
		this.ilock = new Object(); 
		this.slock = new Object();
	}
	private int counter;

	/**
	 * With the 'synchronized' keyword, this method
	 *  Can only be accessed when no other treads are using a 
	 *  synchronized method on this object (the same one, or another).
	 */
	public void increment() {
		synchronized(ilock) {
			this.counter++;
		}
	} 
	
	public synchronized void showValue(String msg) {
		synchronized(slock) {
			int c = counter;
			System.out.println(msg + "says: 'My c is: " + c + "'");
			System.out.println(msg + "says: 'My counter is: " + c + "'");
		}
	}

}