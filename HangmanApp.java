import java.util.Scanner;
public class HangmanApp {
public static void main(String[] args) {	 
	 int wrongCount = 0;
	 String star = "*";
	 String guess;
	//	1st printout	 
	Scanner sc = new Scanner(System.in);
	System.out.println("Hi, lets play a game of Hangman! ");
	System.out.println("If you guess wrong 6 times, you lose ᕙ(⇀‸↼‶)ᕗ");
	System.out.println();	
	//decl.Hangman class obj
	HangmanLetterMethods letterMethods = new HangmanLetterMethods(args);}

	


public static void hangmanImage() {
	int wrongCount = 0;
	if (wrongCount == 1) {
		System.out.println("Wrong guess, try again");
		System.out.println("(ಠ~ಠ)");
	}
	if (wrongCount == 2) {
		System.out.println("Wrong guess, try again");
		System.out.println("ಠ_ಠ");
	}
	if (wrongCount == 3) {
		System.out.println("Wrong guess, try again");
		System.out.println("( ⚆ _ ⚆ )");
	}
	if (wrongCount == 4) {
		System.out.println("Wrong guess, try again");
		System.out.println(" (;´༎ຶД༎ຶ`)");
	}
	if (wrongCount == 5) {
		System.out.println("Wrong guess, try again");
		System.out.println(" (ノಠ益ಠ)ノ彡┻━┻");
		System.out.println(" I'm DEAD!!!!!!!");
	
}	
	
}


	
}
