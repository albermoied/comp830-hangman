package hangman;

public class Word {
	
	private String word;
	private int difficulty;
	
	public Word(int difficulty) {
		this.difficulty = difficulty;
		retrieveWord();
	}
	
	public String getWord() {
		return word;
	}
	
	public void retrieveWord() {
		if (difficulty == 1) {
			//word = getEasyWord();
			word = "plane";
		} else if (difficulty == 2) {
			//word = getMediumWord();
			word = "giraffe";
		} else {
			//word = getHardWord();
			word = "dandelion";
		}
		
	}
}


