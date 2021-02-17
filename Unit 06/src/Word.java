//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		s=word;
	}

	public void setString(String s)
	{
		s=word;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		
		return new StringBuilder(word).reverse().toString();
	}

 	public String toString()
 	{
 		return "" + getFirstChar()+getLastChar()+getBackWards()+word;
	}
}