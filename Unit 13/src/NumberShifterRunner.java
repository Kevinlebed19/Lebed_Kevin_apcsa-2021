//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter test = new NumberShifter();
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
		System.out.println(test.makeLucky7Array(numbers));
		ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,7,7));
		System.out.println(test.makeLucky7Array(numbers1));
		ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(7,7,5,7,7,3,7,7,10));
		System.out.println(test.makeLucky7Array(numbers2));
	}
}



