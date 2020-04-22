import java.util.Scanner;

public class Hangman {

	//declaring variables of word- stats, stringbuffer
	private String word, expandedWord;
	private int live, gamePlayed, won, lost;
	private char c;
	private StringBuffer hiddenWord;
	
	//asaigning a start value for the stats of the game
public Hangman() {
		gamePlayed = 0;
		won = 0;
		lost = 0;
		c = ' ';
				
}//end of method hangman/stats
//method, that hides the word
public void hideWords(String word) {
 this.expandedWord = word;
 hiddenWord = new StringBuffer();
	for (int i=0; i<word.length(); i++) {//starts the for loop 
	 hiddenWord.append("_ "); 
	 expandedWord = word.replace("", " ").trim();
	}//end of for loop
}//end of hiding method
	private void progress (Scanner input, StringBuffer hiddenWord, StringBuffer lettersUsed) {
System.out.println();
System.out.println("Lives: " + live);
System.out.println("Word: " +hiddenWord);
System.out.println("Guess a letter: " );
System.out.println("Letters used: " + lettersUsed);
c = input.next().charAt(0);
c = Character.toLowerCase(c);// so that all type letters would get accepted 

if(!(Character.isLetter(c))) {
	System.out.println("\n-Invalid character was enetered-");
	progress(input, hiddenWord, lettersUsed);
	
}
	}
public void guessWord() {
	StringBuffer lettersUsed = new StringBuffer();
	Scanner input = new Scanner(System.in);
	//decl.variables for the gues word method
	int noComa = 0;
	live = 5;
	boolean compare;
	//while loop continues to run whil live is more than 0
	
	while(live>0) {
		int i = 0;
		boolean stillAlive = false;
		compare = (!(hiddenWord.toString().trim().equals(expandedWord.trim())));
		
		if(compare) {
		progress(input, hiddenWord, lettersUsed);
		
		String chars = lettersUsed.toString();
		
		char charArray[] = chars.toCharArray();
		while (i<charArray.length) {
			if(c == charArray[i]) {
			System.out.println("\nYou have already used: " +c);
			progress(input, hiddenWord, lettersUsed);
			i= -1;
		}
			i++;
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
			won = getWon() + 1;
			break;
		}
		}
	if(!(hiddenWord.toString().trim().equals(expandedWord.trim()))) {
		System.out.println("\n Hey! better luck next time!");
		System.out.println("\n The correct word was: " + word);
		
	}
	gamePlayed ++;
}

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
