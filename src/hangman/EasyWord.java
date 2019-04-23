package hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class EasyWord {

	public EasyWord() {
		
	}
	
	public String getEasyWord() {
		return getRandomWordFromFile("easy.txt");
	}
	
	public String getRandomWordFromFile(String path) {
    	String fileContent = readFileToString(path);
    	String[] words = fileContent.split(",");
    	Random rng = new Random();
    	return words[rng.nextInt(words.length)];
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
		return path;
	}
	
}
