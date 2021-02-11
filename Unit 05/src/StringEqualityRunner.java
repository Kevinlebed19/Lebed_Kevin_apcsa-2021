//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test = new StringEquality();
		
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a word :: ");
		String wordOne = keyboard.next();
		
		out.print("Enter another word :: ");
		String wordTwo = keyboard.next();
		
		test.setWords(wordOne, wordTwo);
		test.checkEquality();
		
		out.print(test);
		
	}
}