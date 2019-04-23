package hangman;

import java.util.Scanner;

public class RunHangman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a difficulty from 1-3: ");
		int difficulty = sc.nextInt();
		Guess guess = new Guess(difficulty);
		
		//if (sc.nextInt() > 3) {
			//System.out.println("Please choose a difficulty 1-3");
		//}

		while (guess.getCount() < 7 && guess.getAsterisk().contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(guess.getAsterisk());
			String next = sc.next();
			guess.makeGuess(next);
		}
		System.out.println("The word was " + guess.getWord());
		System.out.println("\n" + "To restart the game press ");
		//restart main method 
		//if restart ('y') selected, restart game. if restart cancelled ('n'), sc.close();
		//look up scanner methods ie. sc.nextInt()
		sc.close();
		
		//File file = new File(".");
		//for(String fileNames : file.list()) System.out.println(fileNames);
		//use above to make sure text files were in the right path
	}
}
