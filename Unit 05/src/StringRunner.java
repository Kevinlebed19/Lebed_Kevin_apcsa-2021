//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
StringOddOrEven stringTester = new StringOddOrEven();
		
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a word :: ");
		String word = keyboard.next();
		
		stringTester.setString(word);
		
		boolean vowel = stringTester.isEven();
		
		out.print(" it is " + vowel);
	}
}