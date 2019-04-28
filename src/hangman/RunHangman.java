package hangman;

import java.util.Scanner;

public class RunHangman {

	public static void main(String[] args) {
		// boolean done = true;
		boolean reset = true;

		while (reset) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to HANGMAN!" + "\n");
			System.out.println("Please choose a difficulty:");
			System.out.println("Easy(1)--Medium(2)--Hard(3)");
			int difficulty = sc.nextInt();
			boolean Valid = false;

			/*while (!Valid) {
				System.out.println("Choose a difficulty between 1-3");
				difficulty = sc.nextInt();
				if (difficulty >= 1 && difficulty <= 3) {
					Valid = true;
				}
			}*/
			
			Guess guess = new Guess(difficulty);

			while (guess.getCount() < 7 && guess.getAsterisk().contains("*")) {
				System.out.println("Guess any letter in the word");
				System.out.println(guess.getAsterisk());
				String next = sc.next();
				guess.makeGuess(next);
			}
			System.out.println("The word was " + guess.getWord());
			// done = true;

			boolean validate = false;
			while (!validate) {
				System.out.println("\nDo you want to play again?");
				String answer = sc.next();

				if (answer.equalsIgnoreCase("no")) {
					System.out.println("GOOD-BYE, THANKS FOR PLAYING");
					sc.close();
					reset = false; // break outer loop
					validate = true; // break inner loop
				} else if (answer.equalsIgnoreCase("yes")) {
					validate = true; // break inner loop
				} else {
					System.out.println("You inputted a wrong value. Please input yes or no.");
				}
			}

		}
		// restart main method
		// if restart ('y') selected, restart game. if restart cancelled ('n'),
		// sc.close();
		// look up scanner methods ie. sc.nextInt()

		// File file = new File(".");
		// for(String fileNames : file.list()) System.out.println(fileNames);
		// use above to make sure text files were in the right path
	}
}