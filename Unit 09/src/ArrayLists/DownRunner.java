package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{	
		ListDown test = new ListDown();
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345));
		System.out.println(test.go(numbers));
		ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
		System.out.println(test.go(numbers1));
		ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
		System.out.println(test.go(numbers2));
		ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(32767));
		System.out.println(test.go(numbers3));
		ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(255,255));
		System.out.println(test.go(numbers4));
		ArrayList<Integer> numbers5 = new ArrayList<>(Arrays.asList(9,10,-88,100,-555,1000));
		System.out.println(test.go(numbers5));
		ArrayList<Integer> numbers6 = new ArrayList<>(Arrays.asList(10,10,10,11,456));
		System.out.println(test.go(numbers6));
		ArrayList<Integer> numbers7 = new ArrayList<>(Arrays.asList(-111,1,2,3,9,11,20,30));
		System.out.println(test.go(numbers7));
		ArrayList<Integer> numbers8 = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
		System.out.println(test.go(numbers8));
		ArrayList<Integer> numbers9 = new ArrayList<>(Arrays.asList(12,15,18,21,23,1000));
		System.out.println(test.go(numbers9));
		ArrayList<Integer> numbers10 = new ArrayList<>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455));
		System.out.println(test.go(numbers10));
		ArrayList<Integer> numbers11 = new ArrayList<>(Arrays.asList(9,10,-8,10000,-5000,1000));
		System.out.println(test.go(numbers11));
	}
}