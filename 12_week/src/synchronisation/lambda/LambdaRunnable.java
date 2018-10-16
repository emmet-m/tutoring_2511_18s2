package synchronisation.lambda;

public class LambdaRunnable {

	// We're going to abuse Java8 Lamda's to avoid making a class!
	
	public static void wasteTime(String msg) {
		for (int i = 0; i < 100; ++i)
			System.out.println(msg + ": WEEEEEE!");
	}
	
	public static void main (String args[]) {
		
		// You can pass an anonymous 'Runnable' with one line!
		Thread t = new Thread(() -> System.out.println("Lambdaaa!"));

		// You can call other methods via this anonymous runnable
		Thread t2 = new Thread(() -> LambdaRunnable.wasteTime("Thread one"));
		
		// They can make up block of statements too!
		Thread t3 = new Thread(() -> {
			System.out.println("Wait for it.... Wait for it....");
			LambdaRunnable.wasteTime("Thread two");
		});
		
		t2.start();
		t3.start();
		t.start();
	}
}
