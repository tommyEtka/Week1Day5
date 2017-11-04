package Day5Five;

import java.util.Scanner;

public class diceRollerApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out
				.println("Welcome to the Grand Circus Casino! Roll the dice? (yes/no)");
		
	
		int dieOneRollOne = 6;
		int dieOneRollTwo = 1;

		int dieTwoRollOne = 6;
		int dieTwoRollTwo = 1;

		String choice = "yes";
		Scanner scan1 = new Scanner(System.in);
		choice = scan1.nextLine();

		if (choice.equalsIgnoreCase("yes")) {

			System.out.println("");

			System.out.println("Roll 1:");

			int dieOneResult = (int) (Math.random() * dieOneRollOne)
					+ dieOneRollTwo;
			int dieTwoResult = (int) (Math.random() * dieTwoRollOne)
					+ dieTwoRollTwo;

			System.out.println(dieOneResult);
			System.out.println(dieTwoResult);

			System.out.println(" ");
			System.out.println("Roll again? (yes/no)");
			choice = scan1.nextLine();

			while (choice.equalsIgnoreCase("yes")) {
				System.out.println("");

				System.out.println("Roll 1:");

				dieOneResult = (int) (Math.random() * dieOneRollOne)
						+ dieOneRollTwo;
				dieTwoResult = (int) (Math.random() * dieTwoRollOne)
						+ dieTwoRollTwo;

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
