package example;
import java.util.Scanner;

public class NumberReader {

	public static void main(String[] args) {
		System.out.print("Enter numbers: ");
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		while (sc.hasNextInt()) {
			i += sc.nextInt();
		}
		
		System.out.println("Sum is: " + i);
	}

}
