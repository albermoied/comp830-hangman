package hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
			// word = getEasyWord();
			word = "plane";
		} else if (difficulty == 2) {
			// word = getMediumWord();
			word = "giraffe";
		} else {
			// word = getHardWord();
			word = "dandelion";
		}
	}

	/*public String getEasyWord() {
		return getRandomWordFromFile("easy.txt");
	}

	public String readFileToString(String path) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));

			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();
				while (line != null) {
					sb.append(line);
					line = br.readLine();
				}
				return sb.toString();
			} finally {
				br.close();
			}
		} catch (IOException ioe) {
			// Error handling of malformed path
			System.out.println(ioe.getMessage());
		}
	}
	*/
}
