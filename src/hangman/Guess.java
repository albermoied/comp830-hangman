package hangman;

public class Guess {

	private Word word;
	private String words;
	private String asterisk;
	private int count = 0;
	private Draw draw;

	//Sets the number of asterisks shown to be equal to the number of letters in the word
	public Guess(int difficulty) {
		word = new Word(difficulty);
		words = word.getWord();
		asterisk = new String(new char[words.length()]).replace("\0", "*");
		draw = new Draw();
	}
	
	public String getWord() {
		return words;
	}

	public int getCount() {
		return count;
	}
	
	public String getAsterisk() {
		return asterisk;
	}
	
	//Guesses a character
	//Replaces asterisk with the character if its right
	//Adding to count if the guess is wrong
	public void makeGuess(String guess) {
		String hiddenWord = "";
		for (int i = 0; i < words.length(); i++) {
			if (words.charAt(i) == guess.charAt(0)) {
				hiddenWord += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				hiddenWord += words.charAt(i);
			} else {
				hiddenWord += "*";
			}
		}

		//If the character input by the player is incorrect draw Hangman
		if (asterisk.equals(hiddenWord)) {
			count++;
			draw.DrawHangman(count);
		} 
		else {
			asterisk = hiddenWord;
		}
		
		//If the player guesses all the correct letters they win the game
		if (asterisk.equals(words)) {
			System.out.println("That is correct, you win!");
		}
	}
}