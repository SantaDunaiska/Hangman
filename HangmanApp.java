//22.nd of April, 
//Final Hangman project 
// Santa Dunaiska 

// importet a scanner to use the user input 
import java.util.Scanner;

//class name
public class HangmanApp {

	//this is the main method, that will run the previous mentioned class methods of 
	//Hangman and HangmanWords
	//declared the local variables,
	//word, for the word with what the code will work
	//char Playagain, for the boolean loop method, to run the game
	//int lost, won games, for the statistic out pront
	public static void main(String args[]) {
		String word;
		char playAgain;
		int lost, won, games;
		Scanner input = new Scanner(System.in);
		
		//creating obj's of the type Hangman and hangmanWords, 
		Hangman hangmanGame = new Hangman();
		HangmanWords wordsToGuess = new HangmanWords();
		//introduction to the game
		System.out.println("Hey, so lets play a small game"
				+ "let's do Hangman! ");
				System.out.println("The rules are simple- you get 5 lives");
				System.out.println("and you have to guess the word corectly!");
				System.out.println( "If you don't guess the word before you run out of lives");
				System.out.println( "I win, if you gues it- You win!");
//The do/while loop this loop will execute the code block once, 
//before checking if the condition is true, then it will repeat the loop as long as the condition is true-->.
//-->play till you win or lose 
do {
	word = wordsToGuess.getWords();
	hangmanGame.hideWords(word);
	hangmanGame.guessWord();
//asking the user if he/she wants to continue
// if yes the loop will start a gain, and continue to count the games 
//if the answer is n the loop stops and prints out the last screen
	System.out.println("Hey! wanna try again? (Y/N) ");
	playAgain = input.next().charAt(0);
}while (playAgain == 'Y' || playAgain == 'y');

// getting the counts of played games, games lost count, games won count, games played in total 
// from the Hangman class
lost = hangmanGame.getLost();
won = hangmanGame.getWon();
games = hangmanGame.getGamePlayed();

//last outprint after the loop has finished
System.out.println("Game statistics ✍(◔◡◔): \n"
					+" Games played ᕙ(^▿^-): \t " + games+ "\n"
					+"Games won (>‿◠)✌: \t" + won+ "\n"
					+ "Games lost ( ◡́.◡̀)(^◡^ ) : \t" +lost+ "\n");


System.out.println("───────────▒▒▒▒▒▒▒▒\r\n" + 
		           "─────────▒▒▒──────▒▒▒\r\n" + 
		           "────────▒▒───▒▒▒▒──▒░▒\r\n" + 
		           "───────▒▒───▒▒──▒▒──▒░▒\r\n" + 
		           "──────▒▒░▒──────▒▒──▒░▒\r\n" + 
		           "───────▒▒░▒────▒▒──▒░▒\r\n" + 
		           "─────────▒▒▒▒▒▒▒───▒▒\r\n" + 
		           "─────────────────▒▒▒\r\n" + 
		           "─────▒▒▒▒────────▒▒\r\n" + 
		           "───▒▒▒░░▒▒▒─────▒▒──▓▓▓▓▓▓▓▓\r\n" + 
		           "──▒▒─────▒▒▒────▒▒▓▓▓▓▓░░░░░▓▓──▓▓▓▓\r\n" + 
		           "─▒───▒▒────▒▒─▓▓▒░░░░░░░░░█▓▒▓▓▓▓░░▓▓▓\r\n" + 
		           "▒▒──▒─▒▒───▓▒▒░░▒░░░░░████▓▓▒▒▓░░░░░░▓▓\r\n" + 
		           "░▒▒───▒──▓▓▓░▒░░░░░░█████▓▓▒▒▒▒▓▓▓▓▓░░▓▓\r\n" + 
		           "──▒▒▒▒──▓▓░░░░░░███████▓▓▓▒▒▒▒▒▓───▓▓░▓▓\r\n" + 
		           "──────▓▓░░░░░░███████▓▓▓▒▒▒▒▒▒▒▓───▓░░▓▓\r\n" + 
		           "─────▓▓░░░░░███████▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓░░▓▓\r\n" + 
		           "────▓▓░░░░██████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓░░░░▓▓\r\n" + 
		           "────▓▓▓░████▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓\r\n" + 
		           "─────▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓\r\n" + 
		           "─────▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓\r\n" + 
		           "──────▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓\r\n" + 
		           "───────▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓\r\n" + 
		           "─────────▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓\r\n" + 
		           "───────────▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓\r\n" + 
		           "───────────────▓▓▓▓▓▓▓▓\r\n" + 
										"");

}
	}

