import java.util.Scanner;

public class HangmanLetterMethods {

	private static String[] wordsToGuess = {"Naruto", "DeathNote", "Totoro", "OnePeace", "DragonBall", "Bleach", "Hellsing" };
	private static String wordTry = wordsToGuess[(int) (Math.random() * wordsToGuess.length)];
	private static String star = new String(new char[wordTry.length()]).replace("\0", "*");
	
	private static String asterisk = "*";
	private static int count = 0;
	private static String guess;
	
	private static Scanner sc = new Scanner(System.in);
	
   public HangmanLetterMethods(String[] args)
   {
			System.out.println("Guess any letter in the word");
			System.out.println();
			guess = sc.next();
			hang1(guess);

   }		



public void hang1 (String guess) {
	String changeStar = "";
	for (int i = 0; i < wordTry.length(); i++) {
		if (wordTry.charAt(i) != guess.charAt(0)) {
			if (star.charAt(i) != '*')
				changeStar += wordTry.charAt(i);
			else
				changeStar += "*";
		} else
			changeStar += guess.charAt(0);
	}

	if (star.equals(changeStar)) {
		count++;
	//	hangmanImage();----> HangmanApp printout by the guess
	} else {
		star = changeStar;
	}
	if (star.equals(wordTry)) {
		System.out.println("Correct! You win! The word was " + wordTry);
	}
}
////////////////////////////////////////////////////////////////////////////////////////////
}