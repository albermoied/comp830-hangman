package hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class RunHangman {

	public static void main(String[] args) {
		boolean reset = true;
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		

		//Start of the game, prompts the player to choose difficulty
		while (reset) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to HANGMAN!" + "\n");
			System.out.println("Please choose a difficulty:");
			System.out.println("Easy(1)--Medium(2)--Hard(3)");
			
			//Accepts an integer from the player by Scanner
			boolean Valid = false;
			while(!Valid) {
				int difficulty = sc.nextInt();
			
				//Makes sure the player inputs 1, 2, or 3 for difficulty
				//Allows player 7 incorrect guesses before game over
				if(difficulty >=1 && difficulty <=3) {
					Guess guess = new Guess(difficulty);
					while (guess.getCount() < 7 && guess.getAsterisk().contains("*")) {
						System.out.println("\n" + "Guess any letter in the word");
						System.out.println(guess.getAsterisk());
						String next = sc.next();
						guess.makeGuess(next);
						list.add(next);
						System.out.println("\n" + "Guessed Letters");
						System.out.print(list + "\n");
					}
					//Prints the hidden word
					System.out.println("\n" + "The word was " + guess.getWord() + "!");
					Valid = true;
				}
				//Output if the player does not input 1, 2, or 3 for difficulty
				else
					System.out.println("That is an incorrect selection. Please choose 1, 2, or 3");
			}

			//End of the game, checks to see if player wants to restart the game
			boolean validate = false;
			while (!validate) {
				System.out.println("\nDo you want to play again? Type yes or no");
				String answer = sc.next();

				//If the player inputs 'no' quit the game
				if (answer.equalsIgnoreCase("no")) {
					System.out.println("GOOD-BYE, THANKS FOR PLAYING!");
					reset = false; // break outer loop
					validate = true; // break inner loop
				}
					//If the player inputs 'yes', restart the game
				 else if (answer.equalsIgnoreCase("yes")) {
					validate = true; // break inner loop
				}
					//Alert the player if they do not type 'yes' or 'no'
				else {
					System.out.println("That is an incorrect input value. Please type yes or no");
				}
			}
		}
	}
}
