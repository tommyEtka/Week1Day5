package Day5Five;

import java.util.Scanner;

public class diceRollerAppTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out
				.println("Welcome to the Grand Circus Casino! Roll the dice? (yes/no)");

		Scanner scan1 = new Scanner(System.in);

		int dieOneRollOne;
		// int dieOneRollTwo = scan1.nextInt();

		// int dieTwoRollOne = scan1.nextInt();
		// int dieTwoRollTwo = scan1.nextInt();

		String choice = "yes";

		choice = scan1.nextLine();

		if (choice.equalsIgnoreCase("yes")) {

			System.out.println("");

			System.out
					.println("Enter the number of sides for a pair of dice: ");
			dieOneRollOne = scan1.nextInt();
			scan1.nextLine();

			System.out.println("");

			System.out.println("Roll 1:");

			int dieOneResult = (int) (Math.random() * dieOneRollOne) + 1;
			int dieTwoResult = (int) (Math.random() * dieOneRollOne) + 1;

			System.out.println(dieOneResult);
			System.out.println(dieTwoResult);

			System.out.println(" ");
			System.out.println("Roll again? (yes/no)");
			choice = scan1.nextLine();

			while (choice.equalsIgnoreCase("yes")) {
				System.out.println("");

				System.out.println("Roll 1:");

				dieOneResult = (int) (Math.random() * dieOneRollOne) + 1;
				dieTwoResult = (int) (Math.random() * dieOneRollOne) + 1;

				System.out.println(dieOneResult);
				System.out.println(dieTwoResult);

				System.out.println(" ");
				System.out.println("Roll again? (yes/no)");
				choice = scan1.nextLine();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

			}
			System.out.println("Goodbye");

		}

		else {
			System.out.println("Goodbye");

		}

		scan1.close();

	}

}
