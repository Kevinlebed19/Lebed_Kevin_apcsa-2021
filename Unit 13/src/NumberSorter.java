//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = null;
		int most = 0;
		
		for(int i = 0; i<number; i++) {
			
			int tmp = number;
			
			for(int j = 0; j<tmp;) {
				
				if(tmp%10 > most) {
				
					most=tmp%10;
					tmp = tmp/10;
			}
		}
			number=number/10;
			sorted[i] = most;
			most = 0;
	}
		
		return sorted;
	}
}