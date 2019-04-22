package hangman;

public class Guess {

	private Word word;
	private String words;
	private String asterisk;
	private int count = 0;
	private Draw draw;

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
	
	public void makeGuess(String guess) {
		String newasterisk = "";
		for (int i = 0; i < words.length(); i++) {
			if (words.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += words.charAt(i);
			} else {
				newasterisk += "*";
			}
		}

		if (asterisk.equals(newasterisk)) {
			count++;
			draw.DrawHangman(count);
		} else {
			asterisk = newasterisk;
		}
		if (asterisk.equals(words)) {
			System.out.println("Correct! You win! The word was " + words);
		}
	}
}