package Day5Five;

import java.util.Scanner;

public class palindromeExample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = "";
		boolean isPalindrome = true;
		
		System.out.println("Please enter a word to check for palindromes: ");
		
		input = scan.nextLine();
		
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
				isPalindrome = false;
				break;
			
			}
		}
		
		if (isPalindrome) {
			
			System.out.println("This is a Palindrome!");
		} else {
			System.out.println("This is not a Palindrome!");
		
		}
		
		scan.close();
	}
}