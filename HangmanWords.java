
public class HangmanWords {
	private String wordsToGuesArray[] = {"latvian", "german", "estonian",
			                             "russian", "mandarin", "korean",
			                             "latin", "greek", "french",
			                             "english", "romanian", "swahili"};
	private double indexForWordsArray;
	public HangmanWords() {
	}
//get method
	public String getWords() {
		indexForWordsArray = Math.random()*12;
		int i = (int)indexForWordsArray;
		return wordsToGuesArray[i];
	}
}
