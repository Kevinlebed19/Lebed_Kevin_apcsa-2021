//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{			
		RaySumLast test = new RaySumLast();
		int[] tester1 = {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println(test.go(tester1));
		int[] tester2 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(test.go(tester2));
		int[] tester3 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(test.go(tester3));
		int[] tester4 = {32767};
		System.out.println(test.go(tester4));
		int[] tester5 = {255,255};
		System.out.println(test.go(tester5));
		int[] tester6 = {9,10,-88,100,-555,2};
		System.out.println(test.go(tester6));
		int[] tester7 = {10,10,10,11,456};
		System.out.println(test.go(tester7));
		int[] tester8 = {-111,1,2,3,9,11,20,1};
		System.out.println(test.go(tester8));
		int[] tester9 = {9,8,7,6,5,4,3,2,0,-2,6};
		System.out.println(test.go(tester9));
		int[] tester10 = {12,15,18,21,23,1000};
		System.out.println(test.go(tester10));
		int[] tester11 = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		System.out.println(test.go(tester11));
		int[] tester12 = {9,10,-8,10000,-5000,-3000};
		System.out.println(test.go(tester12));

	}
}
