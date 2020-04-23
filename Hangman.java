//22.nd of April, 
//Final Hangman project 
// Santa Dunaiska 

//Imported a scanner, so that we could get the user input after request
import java.util.Scanner;

//Hangman class that is created as a child class 
//that can be accessed by any other class in any package- in our case
//HangmanApp , that will be the runner
public class Hangman {

	//declaring variables of word and expanded word, that will be used for the code that creates the letter method for
	//hiding and processing the word to guess
	//live, gamePlayed, won lost- stats that will be used in the code
	//that processes the games played, lives , won games and lost games
	//private c is used, for the method where a letter guessed right 
	//will be changed from _ to the letter
	//hidden word, that is declared like a String buffer
	// as it is going to be changed with the hidden * <-- signs in the beggining 
	//and during the gameplay the guessed words will be revield
	private String word, expandedWord;
	private int live, gamePlayed, won, lost;
	private char c;
	private StringBuffer hiddenWord;
	
	//assigning a start value for the stats of the game
	// making it trough public so other classes could acces it 
public Hangman() {
		gamePlayed = 0;//all values declared as 0 as so that the counting would start from 1 
		won = 0;
		lost = 0;
		c = ' ';
				
}//end of method hangman/stats

//method, that hides the word, made as public void, so that it would be accessible to other 
//classes and trough void the value could be returned
public void hideWords(String word) {
	//stating the hidden word with letters as the obj word
	this.expandedWord = word;
 	//hiddenWord to a new StringBuffer, so it would be modifiable 
	hiddenWord = new StringBuffer();
 	//declaring the for loop for the letters to be hidden at the start and the letters changed with _<---
 	for (int i=0; i<word.length(); i++) {//starts the for loop 
	 hiddenWord.append("* "); 
	//using the trim method, so spaces would be eliminated
	 expandedWord = word.replace("", " ").trim();
	}//end of for loop
    }//end of hiding method

//through a private void method a progress method is called, to store and process the progress to the player
//during the game play

private void progress (Scanner input, StringBuffer hiddenWord, StringBuffer lettersUsed) {
System.out.println();
System.out.println("                                     ᕙ(⇀‸↼‶)ᕗ Lives: " + live);
System.out.println("Guess a letter: " );
System.out.println("~~~~~~~~~~~~~~~~~~~~");

System.out.println("                           (¬‿¬)  Word: " +hiddenWord);
System.out.println("~~~~~~~~~~~~~~~~~~~~");

System.out.println("You used these letters -->  " + lettersUsed);
System.out.println(" ヽ(ﾟｰﾟ*ヽ)ヽ(*ﾟｰﾟ*)ﾉ(ﾉ*ﾟｰﾟ)ﾉ ");
System.out.println("~~~~~~~~~~~~~~~~~~~~");
c = input.next().charAt(0);// usesand stores the letter provided by the user
c = Character.toLowerCase(c);// so that all type letters would get accepted 

//if statement for the specific block of code that //
//if the requirement is not met the user receives a message of error 
if(!(Character.isLetter(c))) {
	System.out.println("\n- Invalid character was enetered -");
	System.out.println("\n- ¿(❦﹏❦)? -");
	progress(input, hiddenWord, lettersUsed);
	
}//end of if
	}//end of progress
public void guessWord() {
	StringBuffer lettersUsed = new StringBuffer();
	Scanner input = new Scanner(System.in);
	//decl.variables for the guess word method
	int noComa = 0;
	live = 5;
	boolean compare;// declaring a boolean to compare if all letters are visible or lives have run out 
	
	//declaring a while loop to continue to run the game while live is more than 0.
	
	while(live>0) {
		int i = 0;
		boolean stillAlive = false;
		compare = (!(hiddenWord.toString().trim().equals(expandedWord.trim())));
		//if entered character is not a letter found in the word, take down 1 live 
		if(compare) {
		progress(input, hiddenWord, lettersUsed);
		
		String chars = lettersUsed.toString();
		
		char charArray[] = chars.toCharArray();
		while (i<charArray.length) {
			if(c == charArray[i]) {
			System.out.println("\nYou have already used: " +c);
			System.out.println("──▄────▄▄▄▄▄▄▄────▄───");
			System.out.println("─▀▀▄─▄█████████▄─▄▀▀──");
			System.out.println("─────██─▀███▀─██──────");
			System.out.println("───▄─▀████▀████▀─▄────");
			System.out.println("─▀█────██▀█▀██────█▀──");
			

			progress(input, hiddenWord, lettersUsed);
			i= -1;
		}
			i++;
		//if entered letter is in the word. open the word, plus calculate the win
		}
		if(noComa == 0) {
			lettersUsed.append(c);
			noComa = 1;
		}else {
			lettersUsed.append(", "+c);
		}
		for(i = 0; i<expandedWord.length(); i++) {
			char k = expandedWord.charAt(i);
			if(k == c) {
				hiddenWord.setCharAt(i, c);
				stillAlive = true;
			}
		}
		if(!stillAlive) {
			live--;
			
		}
		}else {
			System.out.println("\n Word: " +hiddenWord+ "\n");
			System.out.println("Congrats! You got the word!");
			System.out.println(" \n ♪☆＼(^０^＼) ♪(／^-^)／☆♪  \n");
			///and if you think what I youse for the visuals, that is called Text art, also called ASCII art , made out of text symbols
			System.out.println("████████████████████████████████████████ ");
			System.out.println("██████▀░░░░░░░░▀████████▀▀░░░░░░░▀██████ ");
			System.out.println("████▀░░░░░░░░░░░░▀████▀░░░░░░░░░░░░▀████ ");
			System.out.println("██▀░░░░░░░░░░░░░░░░▀▀░░░░░░░░░░░░░░░░▀██ ");
			System.out.println("██░░░░░░░░░░░░░░░░░░░▄▄░░░░░░░░░░░░░░░██ ");
			System.out.println("██░░░░░░░░░░░░░░░░░░█░█░░░░░░░░░░░░░░░██ ");
			System.out.println("██░░░░░░░░░░░░░░░░░▄▀░█░░░░░░░░░░░░░░░██ ");
			System.out.println("██░░░░░░░░░░████▄▄▄▀░░▀▀▀▀▄░░░░░░░░░░░██ ");
			System.out.println("██▄░░░░░░░░░████░░░░░░░░░░█░░░░░░░░░░▄██ ");
			System.out.println("████▄░░░░░░░████░░░░░░░░░░█░░░░░░░░▄████ ");
			System.out.println("██████▄░░░░░████▄▄▄░░░░░░░█░░░░░░▄██████ ");
			System.out.println("████████▄░░░▀▀▀▀░░░▀▀▀▀▀▀▀░░░░░▄████████ ");
			System.out.println("██████████▄░░░░░░░░░░░░░░░░░░▄██████████ ");
			System.out.println("████████████▄░░░░░░░░░░░░░░▄████████████");
			System.out.println("██████████████▄░░░░░░░░░░▄██████████████ ");
			System.out.println("████████████████▄░░░░░░▄████████████████ ");
			System.out.println("██████████████████▄▄▄▄██████████████████ ");
			System.out.println("████████████████████████████████████████ ");
	

			won = getWon() + 1;
			break;
		}
		}
	if(!(hiddenWord.toString().trim().equals(expandedWord.trim()))) {
				
		System.out.println("\n The correct word was: " + expandedWord);
		
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▄▄▄▄░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▒▒▄██████▒▒▒▒▒▄▄▄█▄▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▄██▀░░▀██▄▒▒▒▒████████▄▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒███░░░░░░██▒▒▒▒▒▒█▀▀▀▀▀██▄▄▒▒▒");
		System.out.println("▒▒▒▒▒▄██▌░░░░░░░██▒▒▒▒▐▌▒▒▒▒▒▒▒▒▀█▄▒");
		System.out.println("▒▒▒▒▒▄██▌░░░░░░░██▒▒▒▒▐▌▒▒▒▒▒▒▒▒▀█▄▒");
		System.out.println("▒▒▒▒▒███░░▐█░█▌░██▒▒▒▒█▌▒▒▒▒▒▒▒▒▒▒▀▌");
		System.out.println("▒▒▒▒████░▐█▌░▐█▌██▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▐████░▐░░░░░▌██▒▒▒█▌▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒████░░░▄█░░░██▒▒▐█▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒████░░░██░░██▌▒▒█▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒████▌░▐█░░███▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▐████░░▌░███▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒████░░░███▒▒▒▒█▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒██████▌░████▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▐████████████▒▒███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒█████████████▄████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("██████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("██████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("█████████████████▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("█████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				

	}
	//adding up count of played games
	gamePlayed ++;
}
//setting get methods to return the values of lost games, won games and games played 
public int getLost() {
	return lost;
}

public int getWon() {
	return won;
}

public int getGamePlayed() {
	return gamePlayed;
}

	
}//end of class hangman
