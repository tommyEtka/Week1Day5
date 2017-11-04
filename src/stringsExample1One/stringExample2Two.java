package stringsExample1One;

import java.util.Scanner;

public class stringExample2Two {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan1 = new Scanner(System.in);
		
		
		String input = scan1.nextLine();
		
		
		System.out.println(input.indexOf("l")); //2
		System.out.println(input.lastIndexOf("l")); //3
		//if you use this and come us with the same number then you only have
		//one "l" in your input
		
		System.out.println(input.length());
		//gives you the number of characters you have
		scan1.close();
		
		
	}

}
