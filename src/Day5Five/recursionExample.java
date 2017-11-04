package Day5Five;

import java.util.Scanner;

public class recursionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan1 = new Scanner(System.in);
		int input = 1;
		
		scan1.nextInt();
		
		System.out.println(getFactorial(input));
		scan1.close();
		
	}

	public static long getFactorial(int input) {
		//input = 1;
		if (input == 1)
			return 1;

		return input * getFactorial(input - 1);

	}

}
