package stringsExample1One;

import java.util.Scanner;

public class codeChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner scan1 = new Scanner(System.in);

        // String s = "Hello";
        String reverse = "";
        String orginal = scan1.nextLine();

    

        for (int i = orginal.length() - 1; i >= 0; i--) {
            reverse = reverse + orginal.charAt(i);

        }
        if (orginal.equalsIgnoreCase(reverse)) {
            System.out.println("Your word is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
			
		scan1.close();
		
		
	}

}
