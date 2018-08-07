package arraylistexample;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class to demonstrate ArrayList usage
 * 
 */
public class DataReader {

	/**
	 * Reads in ints from stdin and returns all successfully read in ints in an array
	 */
	public int[] readData() {
		
		// TODO
		ArrayList<Integer> data = new ArrayList();
		
		Scanner input = new Scanner(System.in);
		
		while (input.hasNextInt()) {
			data.add(input.nextInt());
		}
		
		int[] toRet = new int[data.size()];
		
		for (int i = 0; i < data.size(); i++)
			toRet[i] = data.get(i).intValue();
		
		return toRet;
	}
	
	public static void main(String[] args) {
		// Bootstrap DataReader
		// Test it!
	}

}
