//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		
		ArrayList<Word> list = new ArrayList<Word>();

		int size = file.nextInt();
		
		for(int i = 0; i<size; i++) {
			Word word = new Word(file.nextLine());
			Word word1 = new Word(file.nextLine());
			if(word.compareTo(word1)>0) {
				list.add(word);
			}
		}
		System.out.println(list);

		



		




	}
}