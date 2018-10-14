package synchronisation;

public class LambdaRunnable {

	// We're going to abuse Java8 Lamda's to avoid making a class!
	
	public static void wasteTime() {
		for (int i = 0; i < 1000; ++i)
			System.out.println("WEEEEEE!");
	}
	
	public static void main (String args[]) {
		
		Thread t = new Thread(() -> System.out.println("Lambdaaa!"));
		Thread t2 = new Thread(() -> LambdaRunnable.wasteTime());
		
		t2.start();

		t.start();
	}
}
