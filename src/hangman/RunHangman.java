package hangman;

import java.util.Scanner;

public class RunHangman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a difficulty from 1-3: ");
		int difficulty = sc.nextInt();
		Guess guess = new Guess(difficulty);

		while (guess.getCount() < 7 && guess.getAsterisk().contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(guess.getAsterisk());
			String next = sc.next();
			guess.makeGuess(next);
		}
		System.out.println("The word was " + guess.getWord() + "!");
		sc.close();
	}
}
