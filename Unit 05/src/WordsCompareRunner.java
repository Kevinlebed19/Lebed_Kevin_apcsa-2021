//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare test = new WordsCompare();
		
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a word :: ");
		String wordOne = keyboard.next();
		
		out.print("Enter another word :: ");
		String wordTwo = keyboard.next();
		
		test.setWords(wordOne, wordTwo);
		test.compare();
		
		out.print(test);

	}
}