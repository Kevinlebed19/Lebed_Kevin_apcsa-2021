//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		setString(word);
	}

	public String setString(String s)
	{
		return word=s;
	}

 	public boolean isEven()
 	{
 		if(word.length()%2 == 0) {
 			
 			return true;
 		}else {
 			
 			return false;
 		}
 		

	}

 	public String toString()
 	{
 	
 		return "" +isEven();
	}
}