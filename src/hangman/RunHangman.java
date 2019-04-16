package hangman;

import java.util.Scanner;
import java.lang.Object;

public class RunHangman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Guess asterisk;
		Guess guess;
		String asterisks = asterisk.toString();
		int count = guess.getCount();

		while (count < 7 && asterisks.contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(asterisks);
			String next = sc.next();
			Guess(next);
		}
		sc.close();
	}
}
