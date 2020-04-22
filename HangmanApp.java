import java.util.Scanner;

public class HangmanApp {

	public static void main(String args[]) {
		String word;
		char playAgain;
		int lost, won, games;
		Scanner input = new Scanner(System.in);
		
		Hangman hangmanGame = new Hangman();
		HangmanWords wordsToGuess = new HangmanWords();
		
do {
	word = wordsToGuess.getWords();
	hangmanGame.hideWords(word);
	hangmanGame.guessWord();
	
	System.out.println("Hey! wanna try again? (Y/N) ");
	playAgain = input.next().charAt(0);
}while (playAgain == 'Y' || playAgain == 'y');

lost = hangmanGame.getLost();
won = hangmanGame.getWon();
games = hangmanGame.getGamePlayed();

System.out.println("Game statistics: \n"
					+"Games played: \t " + games+ "\n"
					+"Games won: \t" + won+ "\n"
					+ "Games lost: \t" +lost+ "\n");

}
	}

