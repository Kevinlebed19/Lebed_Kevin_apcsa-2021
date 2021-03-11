package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ListOddToEven test = new ListOddToEven();
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
		System.out.println(test.go(numbers));
		ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7));
		System.out.println(test.go(numbers1));
		ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(10,20,30,40,5,41,31,20,11,7));
		System.out.println(test.go(numbers2));
		ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(32767,70,4,5,6,7));
		System.out.println(test.go(numbers3));
		ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(2,7,11,21,5,7));
		System.out.println(test.go(numbers4));
		ArrayList<Integer> numbers5 = new ArrayList<>(Arrays.asList(7,255,11,255,100,3,2));
		System.out.println(test.go(numbers5));
		ArrayList<Integer> numbers6 = new ArrayList<>(Arrays.asList(9,11,11,11,7,1000,3));
		System.out.println(test.go(numbers6));
		ArrayList<Integer> numbers7 = new ArrayList<>(Arrays.asList(7,7,7,11,2,7,7,11,11,2));
		System.out.println(test.go(numbers7));
		ArrayList<Integer> numbers8 = new ArrayList<>(Arrays.asList(2,4,6,8,8));
		System.out.println(test.go(numbers8));
	}
	
}