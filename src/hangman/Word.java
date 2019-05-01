package hangman;

public class Word {

	private String word;
	private int difficulty;

	public Word(int difficulty) {
		this.difficulty = difficulty;
		retrieveWord(difficulty);
	}

	public String getWord() {
		return word;
	}

	//Gets a word from the text file based on difficulty chosen by player
	public void retrieveWord(int diff) {		
		switch(difficulty) {
		
		//Pulls word from easy file
		case 1:
			EasyWord easy = new EasyWord();
			word = easy.getEasyWord();
			break;
		
		//Pulls word from medium file
		case 2:
			MediumWord medium = new MediumWord();
			word = medium.getMediumWord();
			break;
			
		//Pulls word from hard file
		case 3:
			HardWord hard = new HardWord();
			word = hard.getHardWord();
			break;
		}
	}
}
