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

	public void retrieveWord(int diff) {
		//EasyWord easy = new EasyWord();
		//MediumWord medium = new MediumWord();
		//HardWord hard = new HardWord();
		
		/*
		if (difficulty == 1) {
			word = easy.getEasyWord();
			//word = "plane";
		} else if (difficulty == 2) {
			word = medium.getMediumWord();
			//word = "giraffe";
		} else {
			word = hard.getHardWord();
			//word = "dandelion";
		}*/
		
		
		switch(difficulty) {
		
		case 1:
			EasyWord easy = new EasyWord();
			word = easy.getEasyWord();
			break;
			
		case 2:
			MediumWord medium = new MediumWord();
			word = medium.getMediumWord();
			break;
			
		case 3:
			HardWord hard = new HardWord();
			word = hard.getHardWord();
			break;
			
		/*default:
			RunHangman run = new RunHangman();
			System.out.println("Wrong Selection. Try again...");
			word = "";
			//run.main(null);
		break;*/
		
		}
	}
}
