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
			//retrieve word from easy file
			word = "plane";
		} else if (difficulty == 2) {
			//retrieve word from medium file
			word = "giraffe";
		} else {
			//retrieve word from hard file
			word = "dandelion";
		}
		
	}
}


