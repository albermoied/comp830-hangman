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
		EasyWord easy = new EasyWord();
		MediumWord medium = new MediumWord();
		HardWord hard = new HardWord();
		
		if (difficulty == 1) {
			word = easy.getEasyWord();
			//word = "plane";
		} else if (difficulty == 2) {
			word = medium.getMediumWord();
			//word = "giraffe";
		} else {
			word = hard.getHardWord();
			//word = "dandelion";
		}
	}
}
