//22.nd of April, 
//Final Hangman project 
// Santa Dunaiska 

//HangmanWords class that is created as a child class 
//that can be accessed by any other class in any package- in our case
//HangmanApp , that will be the runner, this class simply stores the words that will be randomly selected 
public class HangmanWords {
	//
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
