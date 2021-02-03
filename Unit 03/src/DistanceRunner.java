//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Distance testDistance = new Distance();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter xOne :: ");
		int xOne = keyboard.nextInt();

		System.out.print("Enter xTwo :: ");
		int xTwo = keyboard.nextInt();

		System.out.print("Enter yOne :: ");
		int yOne = keyboard.nextInt();

		System.out.print("Enter yTwo :: ");
		int yTwo = keyboard.nextInt();
		
		testDistance.setCoordinates(xOne,yOne,xTwo,yTwo );
		testDistance.calcDistance();
		testDistance.print();
		//testDistance.toString();
			
	}
}