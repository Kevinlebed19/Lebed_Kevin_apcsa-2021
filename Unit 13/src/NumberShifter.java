//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static ArrayList<Integer> makeLucky7Array(ArrayList<Integer> array)
	{
		int count = 0;
		for(int i = 0; i < array.size(); i++) {
			if(array.get(i)==7) {
				array.add(count, 7);
				array.remove(i+1);
				count++;
			}
		}
		
		return array;
	}
}